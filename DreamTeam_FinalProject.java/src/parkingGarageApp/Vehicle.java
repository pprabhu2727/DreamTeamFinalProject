package parkingGarageApp;

public class Vehicle {
	private int    year;
	private String make;
	private String model;
	private String license;
	private String vin;
	
	public Vehicle(int year, String make, String model, String license, String vin) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.license = license;
		this.vin = vin;
	}
	
	public String getVehicleInfo() {
		String info = year + " " + make + " " + model
					  + "\nLicense Plate: " + license
					  + "\nVIN: " + vin;
		return info;
	}
}
