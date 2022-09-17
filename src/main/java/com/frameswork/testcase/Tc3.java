package com.frameswork.testcase;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.generic.Basetestcase;

public class Tc3 extends BaseTest {
	@Test
	public void tc33()
	{
		driver.findElement(By.id("addTaskButtonId")).click();
	}
}
