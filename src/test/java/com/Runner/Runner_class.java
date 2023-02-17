package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\vinot\\eclipse-workspace\\CucumberExtent\\src\\test\\java\\com\\Feature\\Adactin.feature",
glue = "com.Stepdefinition",
monochrome = false,
plugin = {"html:Reports/Adactin_Cucumber.html",
		"pretty",
		"json:Reports/JsonFile.json",
	"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"
})
public class Runner_class {
	public static WebDriver driver;
@BeforeClass
	public static void setUp() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
}
@AfterClass
public static void close() {
	driver.quit();

}
}






