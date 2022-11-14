package com.te.template;

public class App {
	public static void main(String[] args) {
		Vehicle vehicle = new HondaCity();
		vehicle.createVehicle();
		
		Vehicle vehicle02 = new SUV();
		vehicle02.createVehicle();
	}
}
