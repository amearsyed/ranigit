package com.frame.POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;


public class PomClass {
	public void loginINACTI() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Syed Amear\\eclipse-workspace\\onlineBatch\\src\\browser_Jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Login_DemoPOM p=new Login_DemoPOM(driver);
		p.getUn().sendKeys("admin");
		Navigation nav=driver.navigate();
		nav.refresh();
		Thread.sleep(3000);
		p.getUn().sendKeys("admin");
		p.getPwd().sendKeys("manager");
		p.getLogin().click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		p.getView().click();
		p.getLock().click();
		p.getApprove().click();
		p.getTask().click();
		p.getAdd().click();
		p.getCustomer().click();
		Thread.sleep(2000);
		p.getName().sendKeys("germany");
		p.getDescr().sendKeys("oiuytr");
		p.getCreate().click();
		p.getLogout().click();
		
		

	
	}
}
