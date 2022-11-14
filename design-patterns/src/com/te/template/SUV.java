package com.te.template;

public class SUV extends Vehicle {

	@Override
	public void vehicleType() {
		System.out.println("This is a Car");
	}

	@Override
	public void vehicleName() {
		System.out.println("SUV");
	}

	@Override
	public void vehicleTyres() {
		System.out.println("Attach 'PQR' company tyres");
		
	}

	@Override
	public void vehicleEngine() {
		System.out.println("Attach 'QRS' type engine");
	}

}
