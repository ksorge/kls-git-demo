package com.livevox.atg.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	App app;
	
	@Before
	public void setUp() {
		app = new App();
	}
	
	@Test
	public void testSayHello() {
		String expected = "Hello World!";
		String actual = app.sayHello(null);
		Assert.assertEquals(expected, actual);
	}

}
