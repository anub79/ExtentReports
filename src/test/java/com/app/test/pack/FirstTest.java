package com.app.test.pack;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.pack.Base;

import jdk.javadoc.internal.tool.Main.Result;

public class FirstTest extends Base{
	@Test
	public void test1() {
		
		String title=driver.getTitle();
		Assert.assertEquals(title, "ABC");
		
	}
	@Test
	public void test2() {
	
		
		String title=driver.getPageSource();
		Assert.assertTrue(true);
		
	}

}
