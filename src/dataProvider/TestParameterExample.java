package dataProvider;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

public class TestParameterExample {
	
	
		
		@Test(dataProvider="SecondChance")   //Mund te thirret ne 2 menyra menyra e pare sipas emrin te klases dhe menyra e dyte sipas 
		public void testAddition(int actual, int expected) {
			int actualResult =actual+20;
			Assert.assertEquals(actualResult, expected);
		}
		
		@DataProvider
		public Object [][] getData(){
			
			return new Object[][] {
				{100,120},
				{200,220},
				{300,320},
				{400,420}
			};
		}
		
		@DataProvider(name="SecondChance")
		public Object [][] getDataSet2(){
			
			return new Object[][] {
				{100,120},
				{200,220},
				{300,320},
				{400,420}
			};
		}
		
}
