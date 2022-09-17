package com.Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.generic.BaseTest;

public class TestCases2 extends BaseTest {
	@Test
	public void tc2()
	{
		driver.findElement(By.cssSelector("a[class='content reports']")).click();
	}
}
