package com.te.template;

public class HondaCity extends Vehicle {

	@Override
	public void vehicleType() {
		System.out.println("This is a Car");
	}

	@Override
	public void vehicleName() {
		System.out.println("Honda City");
	}

	@Override
	public void vehicleTyres() {
		System.out.println("Attach 'Xyz' company tyres");
		
	}

	@Override
	public void vehicleEngine() {
		System.out.println("Attach 'Abc' type engine");
	}

}
