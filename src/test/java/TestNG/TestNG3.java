package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG3 {
	//public WebDriver driver;
	
	
  @BeforeMethod
public void BrowserOpen() {
	  
	System.out.println("Browser open");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");

}
@Test
public void Test1() {
	System.out.println("Test 1");
}
 @Test
 public void Test2() {
		System.out.println("Test 2");
	}
 @Test
 public void Test3() {
		System.out.println("Test 3");
	}
  
 @AfterMethod
 public void Browserclose() {
	 System.out.println("Browser close");
	 
 //driver.close();	
 }
 
  
}
