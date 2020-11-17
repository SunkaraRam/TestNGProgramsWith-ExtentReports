package Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Clarification {
	
	
	@AfterSuite
	public void test1() {
		
		System.out.println("This is beforeSuit");
	}
	
	@BeforeClass
	public void test2() {
			
			System.out.println("This is beforClass");
		}
	@BeforeMethod
	public void test3() {
		
		System.out.println("This is beforeMethod");
	}
	@BeforeTest
	public void test4() {
		
		System.out.println("This is beforeTest");
	}
	@Test
	public void test5() {
		
		System.out.println("I am first TC");
	}
	@Test
	public void test6() {
		
		System.out.println("I am second TC");
	}
	
	@AfterTest
	public void test7() {
		
		System.out.println("This is afterTest");
	}
	@AfterMethod
	public void test8() {
		
		System.out.println("This is afterMethod");
	}

	@AfterClass
	public void test9() {
		
		System.out.println("This is afterClass");
	}
	
	@AfterSuite
	public void test10() {
		
		System.out.println("This is afterSuite");
	}
	
	/*
	 OutPut  : 
	This is beforeSuit
	This is beforeTest
	This is beforClass
	This is beforeMethod
	I am first TC
	This is afterMethod
	This is beforeMethod
	I am second TC
	This is afterMethod
	This is afterClass
	This is afterTest
	PASSED: test5
	PASSED: test6
	*/
	
	
}
