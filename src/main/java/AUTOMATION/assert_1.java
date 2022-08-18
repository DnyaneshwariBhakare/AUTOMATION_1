package AUTOMATION;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assert_1 {


@Test
public void m1() {
	System.out.println("shanti");
	System.out.println("Nama");
	
	String Expected="DNYANU";
	String actual="dnyanu";
	
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(actual,Expected);
	System.out.println("I am tester");
	soft.assertAll();
}
@Test
public void m2() {
	System.out.println("kranti");
	System.out.println("Rama");
	
	String Expected="DNYANU";
	String actual="dnyanu";
	
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(actual, Expected);
	System.out.println("I am tester");
	soft.assertAll();
}
@Test
public void m3() {
	
	String Expected="DNYANU";
	String actual="DNYANU";
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(actual, Expected);
	System.out.println("I am tester");
	soft.assertAll();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
}





