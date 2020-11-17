package ImplementationS;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.relevantcodes.extentreports.LogLevel;


@Listeners(CustomListener.class)
public class TestsDemo{

	
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
	
	String RunTimemethodName = "";
	
	@BeforeMethod//@BeforeClass
	public void beforeclassDemo() {
		
		System.out.println("This is before Class");
		SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss aa");
		   dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("IST"));	
		   String date = dateTimeInGMT.format(new Date());
		   
		   //String pdate = date.replaceAll(" ", "_");
		   
		   String dateR = date.replaceAll("-", "");
		   
		  String dateS = dateR.replaceAll(" ","");
		   
		  String  dateT=dateS.substring(0, 16).replace(":", "")+RunTimemethodName;
		   
		   
		   String datee="charan"+date;
		   
		   System.out.println(dateT);
		   
		   String path = "D:\\SeleniumProjects\\TestNGPrograms\\DriversGCFF\\"+dateT+".html";
		
	
		report = new ExtentHtmlReporter(path);
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
		
		RunTimemethodName = "test1";
		
		test.log(Status.INFO, "User logged in as test1");
		
		test.log(Status.INFO, "Logged in successfull");
		
		test.log(Status.INFO, "Expected and Actual Equal");
		
		test.log(Status.PASS, "test1 pass");
		
		System.out.println("test1");
	}
	@Test
	public void test2() {
		
		RunTimemethodName = "test2";
		System.out.println("test2");
		
		test.log(Status.INFO, "User logged in as test2");
		
		test.log(Status.INFO, "Logged in successfull");
		
		test.log(Status.INFO, "Expected and Actual Not Equal");
		
		
		test.log(Status.INFO, "Format Not matching");
		
		test.log(Status.FAIL, "test2 fail");
		
	}
	@Test
	public void testname(){
		RunTimemethodName="testname";
		
		test.log(Status.INFO, "User logged in as testname");
		
		test.log(Status.INFO, "Logged in successfull");
		
		test.log(Status.INFO, "Expected and Actual Not Equal");
		
		
		test.log(Status.INFO, "Format Not matching");
		
		test.log(Status.FAIL, "test2 pass");
		
		Assert.assertTrue(false);
	
	}
	
	@AfterMethod//@AfterClass
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