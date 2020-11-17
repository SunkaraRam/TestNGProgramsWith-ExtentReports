package Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Constatns.Base;
import ImplementationS.CustomListener;


@Listeners(CustomListener.class)
public class ScreenShotTest extends Base{

	@BeforeMethod
	public void launch() {
		
		initialization();
		
	}
	@Test
	public void loginTest() {
		
		Assert.assertTrue(true);	
		
	}
	
	@Test
	public void registration() {
		
		Assert.assertEquals(false,true);;	
		
	}
	@Test
	public void linkCheck() {
		
		Assert.assertEquals(true,true);;	
		
	}
	
	@Test
	public void logouT(){
		
		Assert.assertEquals(false,true);;	
		
	}
	
	
	@AfterMethod
	public void endApp() {
		
		driver.close();
	}
	
}
