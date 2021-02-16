package groups;

import org.testng.annotations.*;

public class groupClass {
	
	
	@Test(groups="Regression")
	public void class1() {
		System.out.println("Blakaj");
	}
	
	@Test(groups="Regression")
	public void class2() {
		System.out.println("Blakaj -2 ");
	}
	
	@Test(groups="Regression")
	public void class3() {
		System.out.println("Blakaj -3 ");
	}
	
	@Test(groups="Regression")
	public void class4() {
		System.out.println("Blakaj -4");
	}

}
