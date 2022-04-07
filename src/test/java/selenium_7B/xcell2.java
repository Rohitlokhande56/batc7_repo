package selenium_7B;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xcell2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.instagram.com/accounts/login/");
		 driver.manage().window().maximize();

		 
		 String path="C:\\Workspace\\selenium_7B\\testdata\\Book (1).xlsx";
		 FileInputStream fis=new FileInputStream(path);
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 
		    String data1=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
			System.out.println(data1);
			
			String data2=wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
			System.out.println(data2);
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data1);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data2);
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			
			Thread.sleep(4000);
			driver.close();
			
	}

}
