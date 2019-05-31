package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsExample {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//button[contains(text(),'Prompt Pop up')]")).click();
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().sendKeys("Yes");
		driver.switchTo().alert().dismiss();

	}

}
