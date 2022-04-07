package practice1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class broser_handle2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.madeeasy.in/");
		driver.manage().window().maximize();
		
		WebElement close=driver.findElement(By.xpath("//img[@src='/images/crossbutton1.png']"));
		close.click();
		
		WebElement testseries=driver.findElement(By.xpath("//a[text()='Online Test Series']"));
		testseries.click();

		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		
	  Set<String> allwindow=driver.getWindowHandles();
	  System.out.println(allwindow);
	  
	  Iterator<String>  it=allwindow.iterator();
	  while(it.hasNext()) {
		  
		String child=it.next();
		
		if(!parentwindow.equalsIgnoreCase(child)) {
			driver.switchTo().window(child);
			driver.findElement(By.xpath("(//a[text()='Student Login'])[3]")).click();
			driver.navigate().back();
			
			
		}
	  }
		
	}

}
