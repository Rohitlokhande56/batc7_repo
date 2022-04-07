package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class youtube {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement you=driver.findElement(By.xpath("//input[@id='search']"));
		you.sendKeys("pawankhind song");
		
       WebElement but=driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
       but.click();
       
       WebElement you1=driver.findElement(By.xpath("(//img[@id='img'])[61]"));
       you1.click();
	}

}
