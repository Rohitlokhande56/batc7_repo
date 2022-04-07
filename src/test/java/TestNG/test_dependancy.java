package TestNG;
//dependsOnMethods=The list of methods this method depends on
//dependsonmethod ,test depend upon the other test case ,if A test fail then B test also fail
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_dependancy {
	@Test
	public void A() {
		System.out.println("Test A");
		Assert.assertTrue(false);    //we failed this test case then another test cases
		                               //   which depend on this also fail
	}
	@Test(dependsOnMethods="A")
	public void B() {
		System.out.println("Test B");
	}
	@Test(dependsOnMethods="B")
	public void C() {
		System.out.println("Test C");
	}
	@Test
	public void D() {
		System.out.println("Test D");
	}

}
