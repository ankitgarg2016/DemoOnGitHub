package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class framesExample {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("https://www.goibibo.com/");
		Thread.sleep(100);
		driver.findElement(By.id("get_sign_in")).click();
		Thread.sleep(1000);
		
		int x =driver.findElements(By.tagName("iframe")).size();
		System.out.println(x);
		/*
		 * WebElement ifarme = driver.findElement(By.id("authiframe"));
		 * driver.switchTo().frame(ifarme);
		 * 
		 * driver.findElement(By.id("authMobile")).sendKeys("7042233006");
		 */
	}

}
