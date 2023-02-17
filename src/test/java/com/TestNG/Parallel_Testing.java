package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_Testing {
	
	public static WebDriver driver;
	@Test
	private void flipkart() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 driver.get("https://www.flipkart.com/");
			 Thread.sleep(3000);
			 driver.quit();
	}
	@Test
		private void amazon() throws InterruptedException {
				  WebDriverManager.chromedriver().setup();
				  driver=new ChromeDriver();
				  driver.get("https://www.amazon.com/");
				  Thread.sleep(3000);
				  driver.quit();
		}
	@Test
		private void edge() throws InterruptedException {
			  WebDriverManager.edgedriver().setup();
			  driver=new EdgeDriver();
			  driver.get("https://www.facebook.com/");
			  Thread.sleep(3000);
			  driver.quit();
		}
}
