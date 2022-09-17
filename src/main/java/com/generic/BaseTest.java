package com.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public static WebDriver driver;
			@BeforeClass
	public void openbrow() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Syed Amear\\eclipse-workspace\\onlineBatch\\src\\browser_Jar\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		driver.get(f.fetchpro("url"));
		
	}
	
	@BeforeMethod
	public void login() throws Throwable
	{
		driver.findElement(By.id("username")).sendKeys(f.fetchpro("un"),Keys.TAB,f.fetchpro("pwd"),Keys.ENTER);
	
		
    }
		
	@AfterMethod
	public void logout()
	{
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	
}
