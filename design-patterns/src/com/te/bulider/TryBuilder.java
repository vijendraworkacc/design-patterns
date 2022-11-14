package com.te.bulider;

public class TryBuilder {
	public static void main(String[] args) {
		Phone phone = new PhoneBuilder().setBattery(100).setRam(8).build();
		System.out.println(phone);
	}
}
