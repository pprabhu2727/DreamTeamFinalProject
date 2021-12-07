package tests;
import java.util.Scanner;
import static org.junit.Assert.*;
import parkingGarageApp.Main;

import parkingGarageApp.Users;
import parkingGarageApp.Reservation;
import parkingGarageApp.CampusParking;
import parkingGarageApp.LoginManager;
import parkingGarageApp.GarageFloorPrinter;

import org.junit.Test;

public class MainTest {
	
	@Test
	public void testPrintMenuWithReservation() {
		Main.currentUser = new Users();
		Main.currentUser.setReservation(new Reservation());
		Main.printMenu();
	}
	
	// Have to manually enter each menu option from first to last.
	// Before quitting, enter an option that doesn't exist to cover "default" case.
	@Test
	public void menuTest() {
		Main.currentUser = new Users();
		Main.currentUser.setReservation(new Reservation());
		Main.menu();
	}
	
	@Test
	public void printMapTest() {
		Main.printMap();
	}
	
}
