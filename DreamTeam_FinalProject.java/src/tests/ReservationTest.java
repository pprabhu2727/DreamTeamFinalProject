package tests;

import static org.junit.Assert.*;

import java.util.List;

import parkingGarageApp.CampusParking;
import parkingGarageApp.ParkingGarage;
import parkingGarageApp.ParkingSlot;
import parkingGarageApp.Reservation;
import parkingGarageApp.Users;

import org.junit.Test;

public class ReservationTest {

	@Test
	public void constructorTest() {
		Reservation x = new Reservation();
		Reservation y = new Reservation(true);
		Reservation z = new Reservation(1,1,1);
	}
	@Test
	public void makeReservTest() {
		int garageNumber = 1;
		int floorNumber  = 1;
		int slotNumber   = 1;
		int i;
		int j;
		int k;
		Boolean reservation = false;
		Reservation x = new Reservation(garageNumber,floorNumber,slotNumber);
		Users u = new Users("String name", "String Email", "String Address", "String Username", "String Password", "String PhoneNumber");
		Users u2 = new Users("String name", "String Email", "String Address", "String Username", "String Password", "String PhoneNumber");
		u.setReservation(x);
		assertEquals(x,u.getReservation());
		CampusParking.createInstance();
		ParkingSlot ps= new ParkingSlot(slotNumber);
		assertEquals(true,ps.getAvailability());
		ps.changeAvailability();
		assertEquals(false,ps.getAvailability());
		ps.setUser(u);
		x.makeReserv(u);
	
	}
	@Test
	public void getAndsetTest() {
		Reservation x = new Reservation(1,1,1);
		Users u = new Users("String name", "String Email", "String Address", "String Username", "String Password", "String PhoneNumber");
		x.makeReserv(u); 
		x.setReser("Yes");
		assertEquals("Yes",x.getReser());
		x.setReservation(true);
		x.getReservation();
	
	}
	@Test
	public void toStringTest() {
		int garageNumber = 1;
		int floorNumber  = 1;
		int slotNumber   = 1;
		Reservation r = new Reservation(1,1,1);
		String s = "Your reservation has been set for Garage:" +garageNumber +" Floor:" +floorNumber +" and Slot number:" +slotNumber;
		assertEquals(s,r.toString());
	}
}
