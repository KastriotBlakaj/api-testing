package MultiDependency;

import org.testng.Assert;
import org.testng.annotations.*;

public class multiTestDependency {
	
	
	@Test
	public void start() {
		System.out.println("Starting the Website");
	}
	@Test(dependsOnMethods="start")
	public void init() {
		System.out.println("Init method");
	}
	@Test(dependsOnMethods="init")
	public void process() {
		Assert.assertTrue(true);
		System.out.println("Processing data on the server");
	}
	@Test(dependsOnMethods={"process","init"}) //If one method that is depends on fails the process fails as well and skip other steps behind that one
	public void stop() {
		System.out.println("Stop the server");
	}
}
