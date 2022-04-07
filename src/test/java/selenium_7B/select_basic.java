package selenium_7B;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class select_basic {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/test/newtours/register.php");
	    
	    Thread.sleep(2000);
	    
	    //webelement identify
	    WebElement drop_country=driver.findElement(By.xpath("//select[@name='country']"));
	    
	    Select select=new Select(drop_country);
	    //select type
	    //select.selectByIndex(5);
       // select.selectByValue("AUSTRALIA");
	    //select.selectByVisibleText("SINGAPORE");
	    
	    String text=select.getFirstSelectedOption().getText();
	    System.out.println(text);
	    
	    List<WebElement> list=select.getOptions();
	    
	    for(int i=0; i<list.size(); i++) {
	    	Thread.sleep(2000);
	    	String optionname=list.get(i).getText();
	    	 System.out.println(optionname);
	    }
	    
	    
	    
	    
	    
	    
	}

}
