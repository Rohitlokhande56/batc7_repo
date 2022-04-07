package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrolling3 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();

		//page scrolling
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		for(int i=1; i<10;i++) {
			js.executeScript("window.scrollBy(0,1000)");   
			Thread.sleep(2000);
		   }
		   for(int i=1;i<10;i++) {
			   js.executeScript("window.scrollBy(0,-1000)");
		   }
		   Thread.sleep(2000);
	driver.close();
	}
	
	

	
	
}
