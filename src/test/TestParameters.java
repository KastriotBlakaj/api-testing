package test;
import org.testng.annotations.*;

public class TestParameters {
	
	
	@Parameters("name")
	@Test
	public void testCaseOne(String name ) {
		System.out.println("Name " + name);
	}
	@Parameters({"lastname","city"})
	@Test
	public void testCaseTwo(String lastname,String city) {
		System.out.println("LastName : "+ lastname);
		System.out.println("City "+ city);
		
	}

}
