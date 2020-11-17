package Tests;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMethods extends TestClass{
	
	
	@Test(dependsOnGroups="smoke")
	public void test1() {

		System.out.println("Test1");
	}
	@Test(groups="smoke")
	public void test2() {
		System.out.println("Test2");
	}
	@Test(groups="smoke")
	public void test3() {
		System.out.println("Test3");
	}@Test(groups="smoke")
	
	public void test4() {
		System.out.println("Test4");
	}
	@Test(groups="smoke")
	public void test5() {
		System.out.println("Test5");
	}
}
