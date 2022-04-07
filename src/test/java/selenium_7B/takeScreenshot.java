package selenium_7B;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class takeScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.upsc.gov.in/");
		Thread.sleep(2000);
		
		//take Screenshot
		
		
		//scrolling
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,8000)","");
				
		
		String RM=RandomString.make(4);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File detn=new File("C:\\Users\\rohit\\Desktop\\Screenshot\\+"RM+".png");
		
		FileHandler.copy(src, detn);
	
        driver.close();
	}

}
