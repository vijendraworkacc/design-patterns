package com.te.template;

public abstract class Vehicle {
	public abstract void vehicleType();
	public abstract void vehicleName();
	public abstract void vehicleTyres();
	public abstract void vehicleEngine();
	public void createVehicle() {
		vehicleType();
		vehicleName();
		vehicleTyres();
		vehicleEngine();
	}
}
