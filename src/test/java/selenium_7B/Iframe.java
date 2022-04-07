package selenium_7B;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\rohit\\Desktop\\frame.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor) driver;

		// frame1
		driver.switchTo().frame(0);
		js.executeScript("window.scrollBy(0,1000)", "");
		
		//main frame
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		
		//frame2
		driver.switchTo().frame(1);
		js.executeScript("window.scrollBy(0,1000)", "");
		
		//main page
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()=' Click here for Login FaceBook ']")).click();

		Thread.sleep(4000);
		driver.close();
	}

}
