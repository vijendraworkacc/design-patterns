package com.te.singleton;

public class App {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingletonObject();
		Singleton singleton02 = Singleton.getSingletonObject();
		System.out.println(singleton.equals(singleton02));
	}
}
