package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleThreads {

	WebDriver driver;
	
	@Test
	public void test1() {

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			
			driver = new FirefoxDriver();   
		
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.manage().deleteAllCookies();			
			
			driver.get("https://www.youtube.com/");
	}
	
	@Test
	public void test2() {

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			
			driver = new FirefoxDriver();   
		
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.manage().deleteAllCookies();			
			
			driver.get("https://www.facebook.com/");
	}	
	
	@Test
	public void test3() {

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			
			driver = new FirefoxDriver();   
		
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.manage().deleteAllCookies();			
			
			driver.get("http://primusbank.qedgetech.com/");
	}	
	@Test
	public void test4() {

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			
			driver = new FirefoxDriver();   
		
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.manage().deleteAllCookies();			
			
			driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	}	
	
}
