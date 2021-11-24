package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import parkingGarageApp.GarageFloor;
import parkingGarageApp.ParkingGarage;

import org.junit.Test;

public class ParkingGarageTest {

	@Test
	public void getGarageNumberTest() {
		ParkingGarage p = new ParkingGarage(1,3,10); //Garage 1, 3 floors, 10 slots per floor
		assertEquals(1, p.getGarageNumber());
	}
	@Test
	public void getNumberOfFloorsTest() {
		ParkingGarage p = new ParkingGarage(1,3,10); //Garage 1, 3 floors, 10 slots per floor
		assertEquals(3, p.getNumberOfFloors());
	}
	//The test below could probably be done better
	@Test
	public void getFloorListTest() {
		ParkingGarage p = new ParkingGarage(1,3,10); //Garage 1, 3 floors, 10 slots per floor
		ArrayList<GarageFloor> floors = p.getFloorList();
		assertEquals(floors, p.getFloorList());
	}

}
