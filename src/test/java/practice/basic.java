package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basic {

	public static void main(String[] args) throws Exception {
		//setting the path of the chrome driver executable 
		WebDriverManager.chromedriver().setup();
		
		//Launch the chrome browser 
		WebDriver driver=new ChromeDriver();
		
		//Enter the url 
		driver.get("http://www.google.com");
		
		//setting the chrome web to maximize
		driver.manage().window().maximize();
		
		//Get the title of the google page and print it on the console
		String title = driver.getTitle();
		System.out.println("the title of the page is :"+ title);
		
		//Get the URL of the google page and print it on the console 
		String currentUrl = driver.getCurrentUrl(); 
		System.out.println("the URL of the page is :"+ currentUrl);
		
		//Get the source code of the google page and print it on the console 
		String pageSource = driver.getPageSource();
		System.out.println("the source code of the page is :"+ pageSource);
		
		//stop the program execution for 2 seconds
		Thread.sleep(2000);
		
		// Close the browser
		  driver.close();
		}
		}


	


