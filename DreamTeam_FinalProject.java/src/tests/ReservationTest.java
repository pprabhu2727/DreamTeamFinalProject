package tests;

import static org.junit.Assert.*;

import parkingGarageApp.CampusParking;
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
		Reservation x = new Reservation(1,1,1);
		Users u = new Users("String name", "String Email", "String Address", "String Username", "String Password", "String PhoneNumber");
		Users u2 = new Users("String name", "String Email", "String Address", "String Username", "String Password", "String PhoneNumber");
		x.makeReserv(u);
		ParkingSlot ps= new ParkingSlot(1);
		int i = CampusParking.getGarageList().size();
		
	
	}
	@Test
	public void getAndsetTest() {
		Reservation x = new Reservation(1,1,1);
		Users u = new Users("String name", "String Email", "String Address", "String Username", "String Password", "String PhoneNumber");
		x.makeReserv(u); 
		x.setReser("yes");
		assertEquals("yes",x.getReser());
		x.setReservation(true);
		assertEquals(true,x.getReservation());
		
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
