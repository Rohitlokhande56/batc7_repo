package selenium_7B;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggetion {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("maven");
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
		System.out.println(list.size());
		Thread.sleep(5000);
		
		
		//take screenshot
		//file=((TakesScreenshot)driver.g
		System.out.println(list.get(0).getText());
		list.get(0).click();
		
		//Exception in thread "main" org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document
		//  (Session info: chrome=99.0.4844.74)
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getText().equals("maven repository")) {
				list.get(i).click();
				
			
			}
		}
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
