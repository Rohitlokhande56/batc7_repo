package selenium_7B;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_001 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(5000);
	    driver.navigate().to("https://www.microsoft.com");
	    Thread.sleep(5000);
	    driver.navigate().back();
	    Thread.sleep(5000);
	    driver.navigate().refresh();
	    
	    String title=driver.getTitle();
	    System.out.println(title);
	    String curl=driver.getCurrentUrl();
	    System.out.println(curl);
	    driver.close();

	    driver.navigate().
	}
	
	

}
