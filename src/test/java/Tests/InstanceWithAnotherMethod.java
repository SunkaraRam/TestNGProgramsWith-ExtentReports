package Tests;

import org.testng.annotations.Test;

public class InstanceWithAnotherMethod {
	
	String username,password;
	@Test
	public void test1(){
		
		username = "Sunkara";
		password = "Ramu";
	}
	@Test
	public void test2() {
		
		System.out.println(username +"======="+password);
	}

}
