package parkingGarageApp;

public class Vehicle {
	private int    year;
	private String make;
	private String model;
	private String license;
	
	public Vehicle(int year, String make, String model, String license) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.license = license;
	}
	
	public Vehicle() {
		
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setLicense(String license) {
		this.license = license;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getLicense() {
		return license;
	}
	
	public String toString() {
		return year + " " + make + " " + model
			   + "\nLicense Plate: " + license;
	}
}
