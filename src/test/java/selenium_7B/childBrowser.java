package selenium_7B;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class childBrowser {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String parenteindowid=driver.getWindowHandle();
		System.out.println(parenteindowid); //CDwindow-46796DF787D38D46072393D4F4B3F7BC     //id parent window   
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> set=driver.getWindowHandles();  //id parent as well as child window  //gives address of parent and child
		System.out.println(set); //id-CDwindow-46796DF787D38D46072393D4F4B3F7BC, CDwindow-0D55679A55B082D3CDB2CF66654CE190]
		
		Iterator<String> it=set.iterator();  //Here we will iterate through all child windows.
		
		while(it.hasNext()){
			String childwindow=it.next();
			
			if(!parenteindowid.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("bug");
				
				
				
				Thread.sleep(2000);
				driver.close();              //child window
					
			}
				
			driver.close();
		}
		
	}

}
