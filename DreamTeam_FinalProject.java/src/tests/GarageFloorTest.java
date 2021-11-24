package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import parkingGarageApp.GarageFloor;
import parkingGarageApp.ParkingSlot;

import org.junit.Test;

public class GarageFloorTest {

	@Test
	public void getFloorTest() {
		GarageFloor g = new GarageFloor(1,10); //Bottom floor with 10 slots
		assertEquals(1, g.getFloor());
	}
	@Test
	public void getNumberOfSlotsTest() {
		GarageFloor g = new GarageFloor(1,10); //Bottom floor with 10 slots
		assertEquals(10, g.getNumberOfSlots());
	}
	//The test below could probably be done better
	@Test
	public void getSlotsTest() { 
		GarageFloor g = new GarageFloor(1,10); //Bottom floor with 10 slots
		ArrayList<ParkingSlot> slots = g.getSlots();
		assertEquals(slots, g.getSlots());
	}

}
