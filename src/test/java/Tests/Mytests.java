package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Mytests {
	
	//here I have implemented Failed TC execution at @Test Level it is only applicable for test1() method only.
	
	
	@Test
	public void test1() {
		
		Assert.assertEquals(true, false);
		
	}
	
	@Test
	public void test2() {
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://google.comk");
		
		String exp = "Googl";
		
		String act = driver.getTitle();
		
		Assert.assertEquals(exp, act);
	
		
	}
	
	
}
