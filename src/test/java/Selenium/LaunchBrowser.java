package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Throws & Try and catch

public class LaunchBrowser {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		Thread.sleep(200);

		// System.out.println("I am in next line");

		/*
		 * File file = new File("E://file.txt"); FileReader fr = new FileReader(file);
		 */

		try {
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");

			driver = new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.get("https://www.goibibo.com/");
			Thread.sleep(100);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			String xyz="20190509";
			
			driver.findElement(By.xpath("//div[@id='fare_'"+xyz+"]")).click();
			/*
			 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
			 * "notification-frame-~2514428c7"));
			 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
			 * "//*[@class='close']")));
			 * driver.findElement(By.xpath("//*[@class='close']")).click();
			 * driver.findElement(By.id("gosuggest_inputSrc123")).click();
			 * System.out.println("I am after Excptions");
			 */

		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			System.out.println("I am in excption");

		}

		finally {
			driver.quit();
		}

	}

}
