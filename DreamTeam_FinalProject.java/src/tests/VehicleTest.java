package tests;

import parkingGarageApp.Vehicle;
import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {

	String    year;
	String make;
	String model;
	String license;
	String permit;
	
	Vehicle v;
	Vehicle v2;
	
	{
		year = "1990";
		make = "Honda";
		model = "Civic";
		license = "6TRJ244";
		permit = "0046";
		v = new Vehicle(year, make, model, license, permit);
		
		v2 = new Vehicle();
	}
	
	/*
	 * Getters tests
	 */
	@Test
	public void getYearTest() {
		assertEquals("getYearTest", year, v.getYear());
	}
	
	@Test
	public void getMakeTest() {
		assertEquals("getMakeTest", make, v.getMake());
	}
	
	@Test
	public void getModelTest() {
		assertEquals("getModelTest", model, v.getModel());
	}
	
	@Test
	public void getLicenseTest() {
		assertEquals("getLicenseTest", license, v.getLicense());
	}
	
	@Test
	public void getPermitTest() {
		assertEquals("getPermitTest", permit, v.getPermit());
	}
	
	@Test
	public void toStringTest() {
		String vString = year + " " + make + " " + model
				   + "\nLicense Plate: " + license
				   + "\nPermit: " + permit;
		assertEquals("toStringTest", vString, v.toString());
	}
	
	/*
	 * Setters tests
	 */
	
	@Test
	public void setYearTest() {
		v2.setYear(year);
		assertEquals("setYearTest", year, v2.getYear());
	}

	@Test
	public void setMakeTest() {
		v2.setMake(make);
		assertEquals("setMakeTest", make, v2.getMake());
	}
	
	@Test
	public void setModelTest() {
		v2.setModel(model);
		assertEquals("setModelTest", model, v2.getModel());
	}
	
	@Test
	public void setLicenseTest() {
		v2.setLicense(license);
		assertEquals("setLicenseTest", license, v2.getLicense());
	}
	
	@Test
	public void setPermitTest() {
		v2.setPermit(permit);
		assertEquals("setPermitTest", permit, v2.getPermit());
	}
}
