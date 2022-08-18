package automation_1;

public class testdata {
	@Beforesuite
	public void m1() {
		System.out.println("M1")
	}
@BeforeTest
public void m2() {
	System.out.println("M2")
	
}
@Beforeclass
public void m3() {
	System.out.println("M3")
	
	
}
@BeforMethod
public void m4() {
	System.out.println("M4")
}
@Test
public void m5() {
	System.out.println("M5")
}
@AfterMethod
public void m6() {
	System.out.println("M6")
}
@AfterClass
public void m7() {
	System.out.println("M7")
}
@AfterTest
public void m8() {
	System.out.println("M8")
}
@AfterSuite
public void m9() {
	System.out.println("M9")
}













	
	
	
}



}
