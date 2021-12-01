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
		GarageFloorPrinter test = new GarageFloorPrinter(); //Instantiating an object of the class
		int garageNum = 1;
		int floorNum = 1;
		CampusParking.createInstance();
		GarageFloorPrinter.print(garageNum, floorNum);
	}
	//If a slot is reserved, then an R should show up in the map for the test case below
	@Test
	public void oneOrMoreSlotsReserved() {
		int garageNum = 1;
		int floorNum = 1;
		CampusParking.createInstance();
		ArrayList<ParkingGarage> x = CampusParking.getGarageList();
		//changing the availability of a slot
		x.get(garageNum-1).getFloorList().get(floorNum-1).getSlots().get(0).changeAvailability();
		GarageFloorPrinter.print(garageNum, floorNum);
		GarageFloorPrinter.print(garageNum, floorNum);
	}
}
