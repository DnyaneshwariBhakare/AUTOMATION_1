package AUTOMATION;

import org.testng.annotations.Test;

public class test_data {
	@Test(priority=0,enabled=false)
	public void s1() {
		System.out.println("s1");
	}
	
	@Test(priority=2,dependsOnMethods="s3")
	public void s2() {
		System.out.println("s2");}
		
		
		@Test(priority=3)
		public void s3() {
			System.out.println("s3");}
			
			
			@Test(priority=1,invocationCount=2)
			public void s4() {
				System.out.println("s4");}
				

}
