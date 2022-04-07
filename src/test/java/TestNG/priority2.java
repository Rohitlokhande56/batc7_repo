package TestNG;
//invocationCount=The number of times this method should be invoked
  //its means test 3 are exicute 3 times
//enabled=Whether methods on this class/method are enabled.
 //its means we cannot exicute test 3 
import org.testng.annotations.Test;

public class priority2 {

@Test(priority=-1)
	public void A(){
		System.out.println("Test A");
		}

@Test(priority=1,enabled=true)
public void B(){
	System.out.println("Test B");
	}

@Test(invocationCount=3)
public void C(){
	System.out.println("Test C");
	}

@Test(priority=2)
public void D(){
	System.out.println("Test D");
	}

@Test(priority=3,enabled=false)
public void E(){
	System.out.println("Test E");
	}
}
