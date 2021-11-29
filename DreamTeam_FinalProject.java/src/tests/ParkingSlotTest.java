package tests;

import static org.junit.Assert.*;
import parkingGarageApp.ParkingSlot;
import parkingGarageApp.Users;

import org.junit.Test;

import old.Permit;

public class ParkingSlotTest {

	@Test
	public void getAvailabilityTest() {	
		ParkingSlot p = new ParkingSlot(1);		
		boolean x = p.getAvailability();
		assertEquals(true, x);
	}
	@Test
	public void getSlotNumberTest() {	
		ParkingSlot p = new ParkingSlot(1);		
		int x = p.getSlotNumber();
		assertEquals(1, x);
	}
	@Test
	public void changeAvailabilityTest() {
		ParkingSlot p = new ParkingSlot(1);	
		p.changeAvailability();
		assertEquals(false, p.getAvailability());
		p.changeAvailability();
		assertEquals(true, p.getAvailability());
	}
	@Test
	public void UserMethodsTest() {		
		ParkingSlot p = new ParkingSlot(1);	
		Users u = new Users("Name", "name@gmail.com", "123 Address", "username", "password123", "9161111111");
		
		//setUser method
		p.setUser(u);
		//getUser method
		assertEquals(u, p.getUser());
		//clearUser method
		p.clearUser();
		assertEquals(null, p.getUser());
	}

}
