package practice1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser_handle {

	public static void main(String[] args) throws Exception {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
	       String s1=driver.getWindowHandle();
	       System.out.println(s1);
	       Set<String> s2=driver.getWindowHandles();
	       System.out.println(s2);
	       
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
			driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			WebElement mobile=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[8]"));
		    mobile.click();
		   
		    Iterator<String> it=s2.iterator();
		    while(it.hasNext()) {
		    	String childwindow=it.next();
		    	
		    	if(!s1.equalsIgnoreCase(childwindow)) {
		    		driver.switchTo().window(childwindow);
		    		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		    		
		    		Thread.sleep(2000);
		    		driver.getTitle();
		    		driver.navigate().refresh();
			
		}
		
	    	}


	}}	
	
	    	
	    	
	    
	
	


