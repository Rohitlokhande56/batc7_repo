package TestNG;

import org.testng.annotations.Test;

public class multiple_test_case {

	@Test(groups= {"Sanity"})
	public void m1() {
		System.out.println("m1");
	}
	@Test(groups= {"Regression"})
	public void m2() {
		System.out.println("m2");
	}
	@Test(groups= {"Sanity"})
	public void m3() {
		System.out.println("m3");
	}
	@Test(groups= {"Regression"})
	public void m4() {
		System.out.println("m4");
	}
	@Test(groups= {"Sanity"})
	public void m5() {
		System.out.println("m5");
	}
}
