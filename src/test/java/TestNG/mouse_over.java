package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouse_over {
	
	@Test
	public void verify_actionconcept() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(gmail).click().build().perform();
		
		
		
		
		
		
	}

}
