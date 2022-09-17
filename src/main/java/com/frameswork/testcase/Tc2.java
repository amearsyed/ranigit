
package com.frameswork.testcase;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.generic.Basetestcase;

public class Tc2 extends BaseTest {
	@Test
	public void tc22()
	{
		driver.findElement(By.cssSelector("a[class='content reports']")).click();
	}
}
