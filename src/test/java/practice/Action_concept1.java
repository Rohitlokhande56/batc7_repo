package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_concept1 {

	@Test
	public void action() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		//WebElement account=driver.findElement(By.xpath("(//a[@class='nav-a  '])[12]"));
		Actions act=new Actions(driver);
		//act.moveToElement(account).click(account).build().perform();
	
	WebElement rightClick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));		
	act.contextClick(rightClick).build().perform();
	
	Thread.sleep(2000);
	WebElement doubleClick=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	act.doubleClick(doubleClick).build().perform();
	}

}
