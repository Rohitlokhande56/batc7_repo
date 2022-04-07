package com.test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.test_1;
import com.utility.Liabary;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logIN {
	WebDriver driver;
	
	@BeforeMethod
	public void BM() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void verifytest() {
		
		
		//email...
		//password
		//login...
		
		test_1 login=PageFactory.initElements(driver, test_1.class);
		//login.getEmailId().sendKeys("Rohit@489");
		//login.getPassword().sendKeys("123456");
		//login.getLoginbtn().click();
		
		Liabary.custom_Sendkeys(login.getEmailId(), "Rohit@489");
		Liabary.custom_Sendkeys(login.getPassword(), "123456");
        Liabary.custom_Sendkeys(login.getLoginbtn(), "click");
		
        
		
		
		
		}
@AfterMethod
public void AM() {
	driver.close();
}
	
}
