package com.livevox.atg.demo;

public class App {
	public String sayHello(String name) {
		if (null == name) {
			name = "World";
		}
		return "Hello " + name + "!";
	}
}
