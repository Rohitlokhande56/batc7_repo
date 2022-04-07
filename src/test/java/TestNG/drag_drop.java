package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drag_drop {
	
	@Test
	public void Drag_and_drop() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		
		WebElement source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement distn=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		WebElement source2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement distn2=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		WebElement source3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement distn3=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		WebElement source4=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement distn4=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source, distn).perform();
		Thread.sleep(2000);
		
		act.dragAndDrop(source2, distn2).perform();
		Thread.sleep(2000);
		
		act.dragAndDrop(source3, distn3).perform();
		Thread.sleep(2000);
		
		act.dragAndDrop(source4, distn4).perform();
		Thread.sleep(2000);
	
		
	driver.close();	
	}
}
