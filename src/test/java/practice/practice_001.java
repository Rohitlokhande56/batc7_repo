package practice;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class practice_001 {
	@Test
	public void verify_test1() throws Exception {
	
		//step 1(launch browser-.https://www.amazon.in/)
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		//step 2(search mobile-Enter mobile into search box and click search)
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		
		//step 3(scroll page vertically and click on mobile )
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]")).click();
		Thread.sleep(2000);
		
		//step4(switch to child window)
		
       String  parentwindow=driver.getWindowHandle();
       System.out.println(parentwindow);  //gives parentwindow id
		
		Set<String> set=driver.getWindowHandles(); //gives all windows id
		System.out.println(set);
		
		
		Iterator<String> it=set.iterator();
		
		while(it.hasNext()){
			String childwindow=it.next();
			
			if(!parentwindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
				
				Thread.sleep(6000);
				
		driver.getCurrentUrl();
		driver.navigate().refresh();
		
		//step7 (scroll the page utp element addtocart)
		js.executeScript("window.scrollBy(-1000,0)", "");
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
		
		
		//screenshot
		String RM=RandomString.make(3);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File detn=new File("C:\\Users\\rohit\\Desktop\\Screenshot\\.png");
		FileHandler.copy(src, detn);
		
		//delete cart
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		
		//screenshot
		String RM1=RandomString.make(3);
		TakesScreenshot ts1=(TakesScreenshot) driver;
		File src1=ts1.getScreenshotAs(OutputType.FILE);
		File detn1=new File("C:\\Users\\rohit\\Desktop\\Screenshot\\RM1.png");
		FileHandler.copy(src1, detn1);
		
		Thread.sleep(4000);	
		driver.close();
			}
		}
		

	}

}
