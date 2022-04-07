package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org/download");
		driver.manage().window().maximize();
	
		
		//typecasting driver object to JavascriptExecutor interface type
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for (int i = 1; i < 10; i++) {
		//scroll down on the webpage
		js.executeScript("window.scrollBy(0, 1000)"); 
		Thread.sleep(2000);
		}
		
		for (int i = 1; i < 10; i++) {
		//scroll up on the webpage
		js.executeScript("window.scrollBy(0, -1000)");
		Thread.sleep(3000);
		
		driver.close();

	}

}
}