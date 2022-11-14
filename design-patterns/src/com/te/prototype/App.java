package com.te.prototype;

public class App {
	public static void main(String[] args) throws CloneNotSupportedException {
		ComplexObject complexObject = new ComplexObject(123456, "Banglore", 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4);
		System.out.println(complexObject);
		
		ComplexObject complexObject02 = (ComplexObject) complexObject.clone(); 
		complexObject02.setPincodeInCity(456789);
		System.out.println(complexObject02);
	}
}
