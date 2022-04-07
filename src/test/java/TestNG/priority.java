package TestNG;

//use priority keword after @Test(Priority)
//priority keyword decide the which test exicute first
//or we can say manage Test exicution
import org.testng.annotations.Test;

public class priority {
	@Test(priority=3)
	public void A(){
	System.out.println("Test A");
	}
	@Test(priority=2)
	public void B(){
	System.out.println("Test B");
		}
		 
	@Test(priority=-1)
	public void C(){
	System.out.println("Test C");
			}
	 
	@Test(priority=1)
	public void D(){
	System.out.println("Test D");
				}

}
