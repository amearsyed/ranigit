package com.Testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.generic.BaseTest;

public class Testcases3 extends BaseTest {
	@Test
	public void tc3()
	{
		driver.findElement(By.id("addTaskButtonId")).click();
	}
}
