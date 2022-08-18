package AUTOMATION;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_2 {
	@Test
	public void s1(){
		System.out.println("s1 is tester");
		System.out.println("s2 is tester");
		
		String Expected="Hema";
		String actual="Hema";
		
		Assert.assertEquals(actual, Expected);
		System.out.println("I am tester");
	}
	
	@Test
	public void s2() {
		System.out.println("s1 is tester ");
		System.out.println("s2 is tester");
		
		String Expected="Shubham";
		String actual="shubham";
		
		Assert.assertEquals(actual, Expected);
		System.out.println("I am tester");
	}
	
	
	
	
	

}
