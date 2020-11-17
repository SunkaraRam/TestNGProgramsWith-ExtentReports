package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Mytest12 {

	@Test
	public void login() {
		
		Assert.assertEquals(true, false);
		
	}
	
	@Test
	public void registration() {
		
		Assert.assertTrue(true);
	}
	
	@Test
	public void linksCheck() {
		
		Assert.assertEquals(true, true);
		
	}
	
	@Test
	public void titleValidation() {
		
		Assert.assertTrue(true);
	}
	
	@Test
	public void logout() {
		
		Assert.assertFalse(true);
	}
	
}
