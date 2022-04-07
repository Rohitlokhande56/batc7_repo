package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keybord_action {
	@Test
		public void keybord_action(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Rohit48");
		
		//keybord action
		//shift.....>enterdata...>relese
		
		Actions act=new Actions(driver);
		act.keyDown(email, Keys.SHIFT).sendKeys("rohit48").keyUp(Keys.SHIFT).perform();
		
		}
	
	

}
