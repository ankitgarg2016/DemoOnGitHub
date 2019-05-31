package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.ReusableMethod;

public class FirstTestNGClass {

	WebDriver driver;
	static String env;

	/*
	 * @BeforeMethod public void BeforeMethod() throws InterruptedException,
	 * IOException {
	 * 
	 * env="PROD"; //System.setProperty("xyz", "PROD"); String chromedriverPath =
	 * ReusableMethod.getProperty("chromeDriver"); String url =
	 * ReusableMethod.getProperty("url"); System.out.println(chromedriverPath);
	 * System.out.println(url);
	 * 
	 * System.setProperty("webdriver.chrome.driver", chromedriverPath); driver = new
	 * ChromeDriver(); WebDriverWait wait = new WebDriverWait(driver, 30);
	 * driver.get(url); Thread.sleep(100);
	 * driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	 * 
	 * 
	 * }
	 * 
	 * @AfterMethod public void AfterMethod() { //driver.quit(); }
	 * 
	 */
	@Test(priority=1)
	public void login() {
		System.out.println("Login");
	}

	@Test(priority=2)
	public void BookFlight() throws InterruptedException {
		System.out.println("Search Flight"); // Select flight with second lowest price

	}

	/*
	 * @Test(groups= {"Sanity","Regression"}) public void SearchFlight() throws
	 * InterruptedException {
	 * 
	 * System.out.println("Serach test case");
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "E:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe"); WebDriver driver
	 * = new ChromeDriver();//craeting an instance
	 * driver.navigate().to("https://www.goibibo.com/");
	 * driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	 * driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("Delhi");
	 * //Thread.sleep(2000);
	 * driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.DOWN);
	 * //Thread.sleep(2000);
	 * driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(Keys.ENTER);
	 * //Thread.sleep(2000);
	 * 
	 * //Selecting the destination
	 * 
	 * driver.findElement(By.id("gosuggest_inputDest")).sendKeys("Mumbai");
	 * //Thread.sleep(2000);
	 * driver.findElement(By.id("gosuggest_inputDest")).sendKeys(Keys.DOWN);
	 * //Thread.sleep(2000);
	 * driver.findElement(By.id("gosuggest_inputDest")).sendKeys(Keys.ENTER);
	 * //Thread.sleep(2000);
	 * 
	 * //Date Select
	 * 
	 * DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); Date date = new
	 * Date(); System.out.println(dateFormat.format(date)); //
	 * 
	 * String expectedDate= "20190812";//--08 String currentDate ="20190528";//--05
	 * //3 //System.out.println(expectedDate.substring(4, endIndex));
	 * 
	 * //
	 * 
	 * String getID="fare_"+expectedDate;
	 * 
	 * 
	 * driver.findElement(By.id(getID)).click();
	 * driver.findElement(By.id("gi_search_btn")).click();
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @Test(groups= {"Smoke"}) public void BookFlightBasedonFilter() throws
	 * InterruptedException { System.out.println("Search Flight"); // Select flight
	 * with second lowest price
	 * 
	 * }
	 */

}
