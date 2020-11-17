package Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestClass {
	

	@BeforeClass
	public void testClass1() {
		
		System.out.println("TestBeforeClass");
	
	}
	@AfterClass
	public void testClass2() {
		
		System.out.println("TestAfterClass");
	
	}
}
