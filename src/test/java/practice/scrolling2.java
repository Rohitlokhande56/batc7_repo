package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrolling2 {

	public static void main(String[] args) throws Exception {
	

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.xpath("(//img[@class='w-100 shadow-1-strong rounded selenium-backer-logo'])[4]"));
		element.click();
	   int x=element.getLocation().getX();
	   int y=element.getLocation().getY();
	
	   System.out.println("X coordinate is :"+x + " and Y coordinate is :"+ y);
	
	  // X coordinate is :1163 and Y coordinate is :1544
   JavascriptExecutor js=(JavascriptExecutor) driver;
   js.executeScript( ("window.scrollBy(1163,1544)"))
   
  driver.close();
   
	}
	

}
