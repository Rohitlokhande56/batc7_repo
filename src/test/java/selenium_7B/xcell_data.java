package selenium_7B;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class xcell_data {

	public static void main(String[] args) throws IOException, Exception {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 
	 String path="C:\\Workspace\\selenium_7B\\testdata\\Book (1).xlsx";
	 FileInputStream fis=new FileInputStream(path);
	 XSSFWorkbook wb=new XSSFWorkbook(fis);
	 
	String data1=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data1);
	
	String data2=wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
	System.out.println(data2);

       driver.findElement(By.xpath("//input[@name='email']")).sendKeys("data1");
       driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("data2");
       driver.findElement(By.xpath("//button[@name='login']")).click();
       
       
       
       String RM=RandomString.make(3);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File detn=new File("C:\\Users\\rohit\\Desktop\\Screenshot\\"+RM+".png");
		
		FileHandler.copy(src, detn);
       
       Thread.sleep(2000);
    driver.close();
       
	}

}
