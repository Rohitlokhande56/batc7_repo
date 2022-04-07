package selenium_7B;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class closeMainBrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		
		//get the window handle id of the parent browser window
		
		String parentWindowhandleID = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : "+ count);
		
		for (String windowHandle : allWindowHandles) {
			
		//switch to each browser window 
		driver.switchTo().window(windowHandle);
		/* compare the window id with the Parent browser window id, if both are equal, then only 
		close the main browser window.*/
		if (windowHandle.equals(parentWindowhandleID)) { 
		driver.close();
		System.out.println("Main Browser window with title -->"+ title +" --> is closed");
		}}}}


	}

}
