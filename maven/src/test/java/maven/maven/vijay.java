package maven.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class vijay {
	WebDriver driver;
	@BeforeMethod
	public void launchapp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	public void Tc_1() {
		driver.findElement(By.name("q")).sendKeys("vijay krishna");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
