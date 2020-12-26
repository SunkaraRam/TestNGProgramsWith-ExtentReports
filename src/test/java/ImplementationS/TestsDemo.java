package ImplementationS;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	
	private String RunTimemethodName = "test1";
	
	WebDriver driver;
	  
	@BeforeMethod//@BeforeClass
	public void beforeclassDemo() {
		
		   System.out.println("This is before Class");
		   
		   SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss aa");
		   
		   dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("IST"));	
		   
		   String date = dateTimeInGMT.format(new Date());
		   
//		   String pdate = date.replaceAll(" ", "_");
		   
		   String dateR = date.replaceAll("-", "");
		   
		   String dateS = dateR.replaceAll(" ","");
		   
		   String  dateT=RunTimemethodName+"_"+dateS.substring(0, 16).replace(":", "");
		    
		   String datee="charan"+date;
		   
		   System.out.println(dateT);
		   
		   String path = "D:\\SeleniumProjects\\TestNGPrograms\\LatestReports\\"+dateT+".html";
	
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

		System.setProperty("webdriver.chrome.driver", "D:\\ListenersTG\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
	
	}
	
	@Test(priority=1)
	public void atest1() throws InterruptedException{
		
		RunTimemethodName = "test1";
		
		driver.get("https://www.naukri.com/");
		
		test.log(Status.INFO, "Browser launched test1");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]")).click();;
	
		test.log(Status.INFO, "Clicked on Servies test1");	
		
		driver.switchTo().defaultContent();
		
		test.log(Status.INFO, "Came back to parent window");
		
		driver.findElement(By.xpath("//div[contains(text(),'More')]")).click();
		
		test.log(Status.INFO, "Clicked on More");
		
		driver.switchTo().defaultContent();
		
		test.log(Status.INFO, "Came back to parent window");
		
		Set<String> wins = driver.getWindowHandles();
		
		int j =1;
		
		for (String win : wins) {
			
			if (j==2 || j==3 || j==4) {
				
				System.out.println("Entered");
				
				driver.switchTo().window(win);
				
				driver.close();
				
				test.log(Status.INFO, "Switched to "+win);
				
				System.out.println("Switched");
				
				//driver.close();
				
				test.log(Status.INFO, "Closed " + win);
			}
			j++;			
	}
		
		RunTimemethodName = "test2";
		
		//driver.quit();
		
		//driver.switchTo().window(wins[0]);
		
		//TODO Auto-generated method stud

		
	
		

//		
//		test.log(Status.INFO, "User logged in as test1");
//		
//		test.log(Status.INFO, "Logged in successfull");
//		
//		test.log(Status.INFO, "Expected and Actual Equal");
//		
//		test.log(Status.PASS, "test1 pass");
//		
//		System.out.println("test1");
	}
	@Test(priority=2)
	public void btest2() throws InterruptedException {
		
		RunTimemethodName = "test2";
		driver.get("https://www.naukri.com/");
		
		test.log(Status.INFO, "Browser launched test2");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]")).click();;
	
		test.log(Status.INFO, "Clicked on Servies test2");	
		
		driver.switchTo().defaultContent();
		
		test.log(Status.INFO, "Came back to parent window");
		
		driver.findElement(By.xpath("//div[contains(text(),'More')]")).click();
		
		test.log(Status.INFO, "Clicked on More");
		
		driver.switchTo().defaultContent();
		
		test.log(Status.INFO, "Came back to parent window");
		
		Set<String> wins = driver.getWindowHandles();
		
		int j =1;
		
		for (String win : wins) {
			
			if (j==2 || j==3 || j==4) {
				
				System.out.println("Entered");
				
				driver.switchTo().window(win);
				
				test.log(Status.INFO, "Switched to "+win);
				
				driver.close();
				
				System.out.println("Switched");
				
				//driver.close();
				
				test.log(Status.INFO, "Closed " + win);
			}
			j++;
			}	
		
		RunTimemethodName = "testname";
		//driver.quit();

		
//		RunTimemethodName = "test2";
//		System.out.println("test2");
//		
//		test.log(Status.INFO, "User logged in as test2");
//		
//		test.log(Status.INFO, "Logged in successfull");
//		
//		test.log(Status.INFO, "Expected and Actual Not Equal");
//		
//		test.log(Status.INFO, "Format Not matching");
//		
//		test.log(Status.FAIL, "test2 fail");
		
	}
	@Test(priority=3)
	public void ctestname() throws InterruptedException
	{	
		RunTimemethodName="testname";
		
		driver.get("https://www.naukri.com/");
		
		test.log(Status.INFO, "Browser launched testname");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]")).click();;
	
		test.log(Status.INFO, "Clicked on Servies testname");	
		
		driver.switchTo().defaultContent();
		
		test.log(Status.INFO, "Came back to parent window");
		
		driver.findElement(By.xpath("//div[contains(text(),'More')]")).click();
		
		test.log(Status.INFO, "Clicked on More");
		
		driver.switchTo().defaultContent();
		
		test.log(Status.INFO, "Came back to parent window");
		
		Set<String> wins = driver.getWindowHandles();
		
		int j =1;
		
		for (String win : wins) {
			
			if (j==2 || j==3 || j==4) {
				
				System.out.println("Entered");
				
				driver.switchTo().window(win);
				
				driver.close();
				
				test.log(Status.INFO, "Switched to "+win);
				
				System.out.println("Switched");
				
				//driver.close();
				
				test.log(Status.INFO, "Closed " + win);
			}
			j++;			
			
		}
		
		RunTimemethodName = "testname";
		//driver.quit();
//		test.log(Status.INFO, "User logged in as testname");
//		
//		test.log(Status.INFO, "Logged in successfull");
//		
//		test.log(Status.INFO, "Expected and Actual Not Equal");
//		
//		
//		test.log(Status.INFO, "Format Not matching");
//		
//		test.log(Status.FAIL, "testname pass");
		
		//Assert.assertTrue(false);
	
	}
	
	@AfterMethod//@AfterClass
	public void afterClassDemo() {
		
		driver.quit();
		
		extent.flush();
		System.out.println("This is after method");
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