package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Utils.ExcelUtil;

public class BaseClass {
public static WebDriver driver;
static ExcelUtil util=new ExcelUtil();

@BeforeClass
public static void launchBrowser() {
	String browser = util.getProperty("browser");
	System.out.println("browser name:"+browser);
	if(browser.equalsIgnoreCase("chrome")) {
		System.out.println("Inside launch browser");
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse-Photon\\test\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.amazon.in");
		System.out.println("After launch");
	}
}

@AfterClass
public void closeBrowser() {
 driver.close();	
}




}
