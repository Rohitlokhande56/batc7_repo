package selenium_7B;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class select {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.guru99.com/test/newtours/register.php");
	    Thread.sleep(5000);
	    
	    
	    //identify web element
	    //identify first name
	   WebElement id=driver.findElement(By.name("firstName"));
	   id.sendKeys("Rahul");
	   
	   //identify last name
	   WebElement id1=driver.findElement(By.name("lastName"));
	   id1.sendKeys("Patole");
	   
	   //identify phone no
	   WebElement id2=driver.findElement(By.name("phone"));
	   id2.sendKeys("9730218092");
	   
	   //identify email
	   WebElement id3=driver.findElement(By.id("userName"));
	   id3.sendKeys("rahulpatole52@gmail.com");
	   
	   //identify address
	   WebElement id4=driver.findElement(By.name("address1"));
	   id4.sendKeys("teachers colony,satara");
	   
	   //identify city
	   WebElement id5=driver.findElement(By.name("city"));
	   id5.sendKeys("Satara");
	   
	   //identify state
	   WebElement id6=driver.findElement(By.name("state"));
	   id6.sendKeys("Maharastra");
	   
	   //identify postal code
	   WebElement id7=driver.findElement(By.name("postalCode"));
	   id7.sendKeys("415509");
	   
	   WebElement drop_country=driver.findElement(By.xpath("//select[@name='country']"));
	   
	   Select select=new Select(drop_country);
	    //select type
	    //select.selectByIndex(5);
      select.selectByValue("AUSTRALIA");
	    //select.selectByVisibleText("SINGAPORE");
	   
	  // String text=select.getFirstSelectedOption().getText();
	   // System.out.println(text);
	
      
      //identify username
	   WebElement id8=driver.findElement(By.id("email"));
	   id8.sendKeys("Rahul1010");
	   
	   //identify password
	   WebElement id9=driver.findElement(By.name("password"));
	   id9.sendKeys("***********");
	   
	  //identify confirm password
	   WebElement id10=driver.findElement(By.name("confirmPassword"));
	   id10.sendKeys("***********");
	   
	   Thread.sleep(50000);
	   //identify submit
	   WebElement id11=driver.findElement(By.name("submit"));
	   id11.click();
	   
	   driver.close();
	}
	
}
