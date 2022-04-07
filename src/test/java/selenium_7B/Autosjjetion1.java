package selenium_7B;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosjjetion1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("movies");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
		Thread.sleep(5000);
		System.out.println(list.size());
		Thread.sleep(5000);
		System.out.println(list.get(2).getText());
		list.get(2).click();
		
		
	
	}
	
	

}
