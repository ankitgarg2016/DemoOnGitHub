package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTestNGClass {
	
	@BeforeTest
	public void beforeClass() {
		

	}

	@AfterTest
	public void afterClass() {
		System.out.println("This will execute after the Test in seciond test class");
	}


  @Test
  public void testcase1() {
	  System.out.println("First Test Case");
  }
}
