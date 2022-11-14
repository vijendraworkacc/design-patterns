package com.te.prototype;

public class ComplexObject implements Cloneable {
	private long pincodeInCity;
	private String city;
	private double readingFromSensor01;
	private double readingFromSensor02;
	private double readingFromSensor03;
	private double readingFromSensor04;
	private double readingFromSensor05;
	private double readingFromSensor06;
	private double readingFromSensor07;
	private double readingFromSensor08;
	private double readingFromRemoteSensor01;
	private double readingFromRemoteSensor02;
	private double readingFromRemoteSensor03;
	private double readingFromRemoteSensor04;

	public long getPincodeInCity() {
		return pincodeInCity;
	}

	public void setPincodeInCity(long pincodeInCity) {
		this.pincodeInCity = pincodeInCity;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getReadingFromSensor01() {
		System.out.println("Reading sensor data...");
		return readingFromSensor01;
	}

	public void setReadingFromSensor01(double readingFromSensor01) {
		this.readingFromSensor01 = readingFromSensor01;
	}

	public double getReadingFromSensor02() {
		System.out.println("Reading sensor data...");
		return readingFromSensor02;
	}

	public void setReadingFromSensor02(double readingFromSensor02) {
		this.readingFromSensor02 = readingFromSensor02;
	}

	public double getReadingFromSensor03() {
		System.out.println("Reading sensor data...");
		return readingFromSensor03;
	}

	public void setReadingFromSensor03(double readingFromSensor03) {
		this.readingFromSensor03 = readingFromSensor03;
	}

	public double getReadingFromSensor04() {
		System.out.println("Reading sensor data...");
		return readingFromSensor04;
	}

	public void setReadingFromSensor04(double readingFromSensor04) {
		this.readingFromSensor04 = readingFromSensor04;
	}

	public double getReadingFromSensor05() {
		System.out.println("Reading sensor data...");
		return readingFromSensor05;
	}

	public void setReadingFromSensor05(double readingFromSensor05) {
		this.readingFromSensor05 = readingFromSensor05;
	}

	public double getReadingFromSensor06() {
		System.out.println("Reading sensor data...");
		return readingFromSensor06;
	}

	public void setReadingFromSensor06(double readingFromSensor06) {
		this.readingFromSensor06 = readingFromSensor06;
	}

	public double getReadingFromSensor07() {
		System.out.println("Reading sensor data...");
		return readingFromSensor07;
	}

	public void setReadingFromSensor07(double readingFromSensor07) {
		this.readingFromSensor07 = readingFromSensor07;
	}

	public double getReadingFromSensor08() {
		System.out.println("Reading sensor data...");
		return readingFromSensor08;
	}

	public void setReadingFromSensor08(double readingFromSensor08) {
		this.readingFromSensor08 = readingFromSensor08;
	}

	public double getReadingFromRemoteSensor01() {
		System.out.println("Reading sensor data...");
		return readingFromRemoteSensor01;
	}

	public void setReadingFromRemoteSensor01(double readingFromRemoteSensor01) {
		this.readingFromRemoteSensor01 = readingFromRemoteSensor01;
	}

	public double getReadingFromRemoteSensor02() {
		System.out.println("Reading sensor data...");
		return readingFromRemoteSensor02;
	}

	public void setReadingFromRemoteSensor02(double readingFromRemoteSensor02) {
		this.readingFromRemoteSensor02 = readingFromRemoteSensor02;
	}

	public double getReadingFromRemoteSensor03() {
		System.out.println("Reading sensor data...");
		return readingFromRemoteSensor03;
	}

	public void setReadingFromRemoteSensor03(double readingFromRemoteSensor03) {
		this.readingFromRemoteSensor03 = readingFromRemoteSensor03;
	}

	public double getReadingFromRemoteSensor04() {
		System.out.println("Reading sensor data...");
		return readingFromRemoteSensor04;
	}

	public void setReadingFromRemoteSensor04(double readingFromRemoteSensor04) {
		this.readingFromRemoteSensor04 = readingFromRemoteSensor04;
	}

	public ComplexObject(long pincodeInCity, String city, double readingFromSensor01, double readingFromSensor02,
			double readingFromSensor03, double readingFromSensor04, double readingFromSensor05,
			double readingFromSensor06, double readingFromSensor07, double readingFromSensor08,
			double readingFromRemoteSensor01, double readingFromRemoteSensor02, double readingFromRemoteSensor03,
			double readingFromRemoteSensor04) {
		super();
		this.pincodeInCity = pincodeInCity;
		this.city = city;
		this.readingFromSensor01 = readingFromSensor01;
		this.readingFromSensor02 = readingFromSensor02;
		this.readingFromSensor03 = readingFromSensor03;
		this.readingFromSensor04 = readingFromSensor04;
		this.readingFromSensor05 = readingFromSensor05;
		this.readingFromSensor06 = readingFromSensor06;
		this.readingFromSensor07 = readingFromSensor07;
		this.readingFromSensor08 = readingFromSensor08;
		this.readingFromRemoteSensor01 = readingFromRemoteSensor01;
		this.readingFromRemoteSensor02 = readingFromRemoteSensor02;
		this.readingFromRemoteSensor03 = readingFromRemoteSensor03;
		this.readingFromRemoteSensor04 = readingFromRemoteSensor04;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "ComplexObject [pincodeInCity=" + pincodeInCity + ", city=" + city + ", readingFromSensor01="
				+ readingFromSensor01 + ", readingFromSensor02=" + readingFromSensor02 + ", readingFromSensor03="
				+ readingFromSensor03 + ", readingFromSensor04=" + readingFromSensor04 + ", readingFromSensor05="
				+ readingFromSensor05 + ", readingFromSensor06=" + readingFromSensor06 + ", readingFromSensor07="
				+ readingFromSensor07 + ", readingFromSensor08=" + readingFromSensor08 + ", readingFromRemoteSensor01="
				+ readingFromRemoteSensor01 + ", readingFromRemoteSensor02=" + readingFromRemoteSensor02
				+ ", readingFromRemoteSensor03=" + readingFromRemoteSensor03 + ", readingFromRemoteSensor04="
				+ readingFromRemoteSensor04 + "]";
	}

}
