package practice1;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mock_001 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();
		
		//step1
		WebElement element=driver.findElement(By.xpath("//a[@class='btn btn-lg']"));
		element.click();
		
		String id1=driver.getWindowHandle();
		System.out.println(id1);
		
		Set<String> list=driver.getWindowHandles();
		System.out.println(list);
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			String child=it.next();
			if(!id1.equalsIgnoreCase(child))
				driver.switchTo().window(child);
			
			Thread.sleep(2000);
			
			//address
			WebElement address=driver.findElement(By.xpath("//input[@id='autocomplete']"));
			address.sendKeys("At post mhaswad,tal-man dist-satara");
			
			//street address
			WebElement street=driver.findElement(By.xpath("//input[@id='street_number']"));
			street.sendKeys("teachers colony");
			
			//street address2
			WebElement address2=driver.findElement(By.xpath("//input[@id='route']"));
			address2.sendKeys("panyachi taki");
			
			//city
			WebElement city=driver.findElement(By.xpath("//input[@id='locality']"));
			city.sendKeys("Mhaswad");
			
			//state
			WebElement state=driver.findElement(By.xpath("//input[@id='administrative_area_level_1']"));
			state.sendKeys("Maharastra");

			//postal code
			WebElement code=driver.findElement(By.xpath("//input[@id='postal_code']"));
			code.sendKeys("415509");
			
			//country
			WebElement country=driver.findElement(By.xpath("//input[@id='country']"));
			country.sendKeys("India");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(4000);
		
		WebElement buttons=driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[2]"));
		buttons.click();
		
		Thread.sleep(2000);
		WebElement link=driver.findElement(By.xpath("//button[@class='btn btn-lg btn-link']"));
		link.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		WebElement drop=driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary'])[3]"));
		drop.click();
		
		//driver.switchTo().defaultContent();
		
		
	//driver.close();		
 
	}


}
