package parkingGarageApp;

public class Vehicle {
	private String   year;
	private String make;
	private String model;
	private String license;
	private String permit;
	
	public Vehicle(String year, String make, String model, String license, String permit) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.license = license;
		this.permit = permit;
	}
	
	public Vehicle() { }
	
	public void setYear(String year) {
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
	
	public void setPermit(String permit) {
		this.permit = permit;
	}
	
	public String getYear() {
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
	
	public String getPermit() {
		return permit;
	}
	
	public String toString() {
		return year + " " + make + " " + model
			   + "\nLicense Plate: " + license
			   + "\nPermit: " + permit;
	}
}
