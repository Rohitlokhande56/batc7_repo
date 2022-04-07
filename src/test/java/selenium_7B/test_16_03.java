package selenium_7B;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_16_03 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//identify webelement.....emailid
		WebElement emailid=driver.findElement(By.id("email"));
		emailid.sendKeys("bugspotter");
		
		//password
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("1234568");
		
		//loginbutton
		WebElement loginbtn=driver.findElement(By.tagName("button"));
		loginbtn.click();
	
      driver.findElement(By.xpath("//*[@id=\"email\"]"));
	}

}
