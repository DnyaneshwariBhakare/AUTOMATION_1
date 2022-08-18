package AUTOMATION;

import org.testng.annotations.Test;

public class groups {
	@Test(groups="Sanity")
	public void s1() {
		System.out.println("s1");
	}
	
	@Test(groups="Sanity")
	public void s2() {
		System.out.println("s2");}
		
		
		@Test(groups="UAT")
		public void s3() {
			System.out.println("s3");}
			
			
			@Test(groups="UAT")
			public void s4() {
				System.out.println("s4");}
				

}


