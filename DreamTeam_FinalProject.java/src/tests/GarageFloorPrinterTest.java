package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import parkingGarageApp.CampusParking;
import parkingGarageApp.GarageFloorPrinter;
import parkingGarageApp.ParkingGarage;

import org.junit.Test;

public class GarageFloorPrinterTest {

	@Test
	public void baseTestCase() {
		CampusParking.createInstance();
		GarageFloorPrinter.print(1, 1);
	}
	//If a slot is reserved, then an R should show up in the map for the test case below
	@Test
	public void oneOrMoreSlotsReserved() {
		CampusParking.createInstance();
		ArrayList<ParkingGarage> x = CampusParking.getGarageList();
		//changing the availability of a slot
		x.get(1).getFloorList().get(1).getSlots().get(0).changeAvailability();
		GarageFloorPrinter.print(1, 1);
	}
}
