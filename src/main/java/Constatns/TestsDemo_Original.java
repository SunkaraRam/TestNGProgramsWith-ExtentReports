package Constatns;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestsDemo_Original {

	
//	public ExtentHtmlReporter report = null;
//	public ExtentReports extent = null;
//	public ExtentTest test = null;
	
	public ExtentHtmlReporter report = null;
	
	public ExtentReports extent = null;
	
	public ExtentTest test = null;
	
	@BeforeSuite
	public void beforesuitDemo() {
		
		System.out.println("This is before Suite");
	}
	
	@BeforeTest
	public void beforeTestDemo() {
		
		System.out.println("This is before Test");
		
	}
	
	@BeforeClass
	public void beforeclassDemo() {
		
		System.out.println("This is before Class");
		report = new ExtentHtmlReporter("./DriversGCFF/testingFile.html");
		report.config().setDocumentTitle("Automation Test Report");
		report.config().setReportName("RAmSunkara");
		report.config().setTheme(Theme.STANDARD);
		report.start();
		
		extent = new ExtentReports();
		
		extent.attachReporter(report);
		extent.setSystemInfo("Application", "Amezon");
		extent.setSystemInfo("Operating System", System.getProperty("os.name"));
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		test = extent.createTest("Verify Test one");
	}
	
	@Test
	public void test1(){
		
		test.log(Status.PASS, "test1 pass");
		
		System.out.println("test1");
	}
	@Test
	public void test2() {
		
		System.out.println("test2");
		test.log(Status.PASS, "test2 pass");
		
	}
	@Test
	public void testname(){
		
		System.out.println("test3");
		test.log(Status.PASS, "test3 pass");
	
	}
	
	@AfterClass
	public void afterClassDemo() {
		
		
		extent.flush();
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