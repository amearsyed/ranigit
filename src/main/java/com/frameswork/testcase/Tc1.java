package com.frameswork.testcase;

import org.openqa.selenium.By;

import com.generic.BaseTest;

public class Tc1 extends BaseTest {
	public void tc11()
	{
		driver.findElement(By.cssSelector("a[class='content task']")).click();
	}
}
