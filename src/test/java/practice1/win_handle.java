package practice1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class win_handle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html?m=1");
		driver.manage().window().maximize();
		
       String parentHandle=driver.getWindowHandle();
   
       System.out.println("parent window -"+parentHandle);
		driver.findElement(By.xpath("//button[@class='whButtons']")).click();
		Set<String> handles=driver.getWindowHandles();
		
		for(String handle : handles) {
			 System.out.println(handle);
		}
	driver.quit();
	}
	

}
