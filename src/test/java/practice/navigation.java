package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigation {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
	
		driver.navigate().to("http://www.gmail.com");
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000); 
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		driver.close();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String title=driver.getTitle();
		System.out.println(title);
		


	}
}
