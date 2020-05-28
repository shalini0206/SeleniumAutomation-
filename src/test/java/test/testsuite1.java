package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testsuite1 {
	
	@Test
public void negativelogin( ) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https:/magento.com");
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a")).click();
				driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
				driver.findElement(By.id("pass")).sendKeys("123");
				driver.findElement(By.id("send2")).click();
				Thread.sleep(5000);
				String msg = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")).getText();
			System.out.println(msg);
			Assert.assertEquals(msg, "Invalid login or password.");
			driver.quit();

	}
}
