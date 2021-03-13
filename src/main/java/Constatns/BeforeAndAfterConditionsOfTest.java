package Constatns;


import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BeforeAndAfterConditionsOfTest {
	
	@BeforeSuite 
	public void beforesuitDemo() {
		
		System.out.println("This is before Suite");
	}
	
	@BeforeTest
	public void beforeTestDemo() {
		
		//System.out.println("This is before Test");
		
	}
	
	@BeforeClass
	public void beforeclassDemo() {
		
		System.out.println("This is before Class");

	}
	
	
//	public void test1() {
//		
//		System.out.println("It's not a proble you can proceed");
//	}
	
	@AfterClass
	public void afterClassDemo() {
		
		System.out.println("This is after Class");
		
	}
	
	
	@AfterTest
	private void afterTestDemo() {
		
		System.out.println("This is After test");
		
	}
	
	@AfterSuite
	public void aftersuitDemo() {
		
		System.out.println("This is After Suite");
		
	}

}
