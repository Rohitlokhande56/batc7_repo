package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {

	@BeforeSuite
	public void BS() {
		System.out.println("Before Suite");
	}
	@BeforeClass
	public void BC() {
		System.out.println("Before Class");
	}
	@BeforeTest
	public void BT() {
		System.out.println("Before Test");
	}
	@BeforeMethod
	public void BM() {
		System.out.println("Before Method");
	}
	@Test
	public void verifytest1() {
		System.out.println("Test 1");
	}
	
	//AfterTest
	
	@AfterMethod
	public void AM() {
		System.out.println("After Method");
		
	}
	@AfterClass
	public void AC() {
		System.out.println("After Class");
		
	}
	@AfterTest
	public void AT() {
		System.out.println("After Test");
		
	}
	@AfterSuite
	public void AS() {
		System.out.println("After Suite");
		
	}
	
	
}
