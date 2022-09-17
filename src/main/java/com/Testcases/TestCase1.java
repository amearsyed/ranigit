package com.Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.generic.BaseTest;

public class TestCase1 extends BaseTest{
	@Test
	public void tc2()
	{
		driver.findElement(By.cssSelector("a[class='content users']")).click();
	}
}
