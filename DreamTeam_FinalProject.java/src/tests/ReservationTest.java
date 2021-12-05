package tests;

import static org.junit.Assert.*;
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
	}
	@Test
	public void getAndsetTest() {
		Reservation x = new Reservation(1,1,1);
		Users u = new Users("String name", "String Email", "String Address", "String Username", "String Password", "String PhoneNumber");
		x.makeReserv(u); 
		x.setReser("Yes");
		assertEquals("Yes",x.getReser());
		x.setReservation(true);
		assertEquals(true,x.getReservation());
	}
	

}
