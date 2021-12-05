package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import parkingGarageApp.CampusParking;
import parkingGarageApp.ParkingGarage;

import org.junit.Test;

public class CampusParkingTest {

	@Test
	public void generalTest() {
		CampusParking x = CampusParking.createInstance();
	}
	@Test
	public void singletonTest() {
		CampusParking x = CampusParking.createInstance();
		CampusParking y = CampusParking.createInstance();
		assertEquals(x,y);
	}
	@Test
	public void getGarageListTest() {
		ArrayList<ParkingGarage> x = CampusParking.getGarageList();
		assertEquals(x,CampusParking.getGarageList());
	}

}
