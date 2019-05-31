package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RashiDemo {

	@BeforeTest
	public void beforeClass() {
		System.out.println("This will execute before the Test");

	}

	@AfterTest
	public void afterClass() {
		System.out.println("This will execute after the Test");
	}

	/*
	 * @BeforeTest
	 * 
	 * public void beforeTest() {
	 * 
	 * System.out.println("This will execute before the Test");
	 * 
	 * }
	 * 
	 * @AfterTest
	 * 
	 * public void afterTest() {
	 * 
	 * System.out.println("This will execute after the Test");
	 * 
	 * }
	 * 
	 * @BeforeSuite
	 * 
	 * public void beforeSuite() {
	 * 
	 * System.out.println("This will execute before the Test Suite");
	 * 
	 * }
	 * 
	 * @AfterSuite
	 * 
	 * public void afterSuite() {
	 * 
	 * System.out.println("This will execute after the Test Suite");
	 * 
	 * }
	 */
	@Test
	public void login() {
		System.out.println("My first test case");
	}

	@Test
	public void login2() {
		System.out.println("My second test case");
	}

}
