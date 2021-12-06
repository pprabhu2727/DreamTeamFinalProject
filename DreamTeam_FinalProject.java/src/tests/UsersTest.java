package tests;
import parkingGarageApp.Reservation;
import parkingGarageApp.Users;
import parkingGarageApp.Vehicle;

import static org.junit.Assert.*;

import org.junit.Test;

public class UsersTest {
	
	String year = "2002";
	String make = "toyota";
	String model = "corolla";
	String license = "*******";
	String permit = "permit";
	Users p2 = new Users();

	//get tests
	@Test
	public void getNametest() {
		String s = "Randall Boggs";
		Users p = new Users(s, "", "", "", "", "");
		assertEquals("Randall Boggs", p.getName());
	}
	
	@Test
	public void getEmailtest() {
		String s = "vboyack@csus.edu";
		Users p = new Users("", s, "", "", "", "");
		assertEquals("vboyack@csus.edu", p.getEmail());
	}
	
	@Test
	public void getAddresstest() {
		String s = "6000 J Street, Sacramento, CA 95819";
		Users p = new Users("", "", s, "", "", "");
		assertEquals("6000 J Street, Sacramento, CA 95819", p.getAddress());
	}
	
	@Test
	public void getUsernametest() {
		String s = "vboyack";
		Users p = new Users("", "", "", s, "", "");
		assertEquals("vboyack", p.getUsername());
	}
	
	@Test
	public void getPhonetest() {
		String s = "(916)278-6011";
		Users p = new Users("", "", "", "", "", s);
		assertEquals("(916)278-6011", p.getPhone());
	}
	
	@Test
	public void getPasswordtest() {
		String s = "abc123";
		Users p = new Users("", "", "", "", s, "");
		assertEquals("abc123", p.getPassword());
	}
	
	
	@Test
	public void getVehicletest() {
		Vehicle p = new Vehicle(year, make, model, license, permit);
		Users b = new Users("", "", "", "", "", "", p);
		assertEquals(p, b.getVehicle());
	}
	
	@Test
	public void getReservationtest() {
		int i = 0;
		int j = 0;
		int k = 0;
		Vehicle p = new Vehicle(year, make, model, license, permit);
		Reservation r = new Reservation(i, j, k);
		Users a = new Users("", "", "", "", "", "", p, r);
		assertEquals(r, a.getReservation());
	}
	
	@Test
	public void toStringtest() {
		String username = "vboyack";
		String password = "abc123";
		String name = "Randall";
		String email = "vboyack@csus.edu";
		String address = "6000 J Street, Sacramento, CA 95819";
		String phone = "(916)278-6011";
		Vehicle v = new Vehicle(year, make, model, license, permit);
		String s = "User Info:"+"\n Username: " + username + "\n Password: " + password + "\n Name: " + name +  "\n Email: " + email + "\n Address: " + address + "\n Phone:" + phone +  "\n Vehicle Info: " + v +"\n";
		Users p = new Users(name, email, address, username, password, phone, v);
		assertEquals(s, p.toString());
	}
	
	//set tests
	
	@Test
	public void setNametest() {
		String s = "Randall Boggs";
		p2.setName(s);
		assertEquals("Randall Boggs", p2.getName());
	}
	
	@Test
	public void setEmailtest() {
		String s = "vboyack@csus.edu";
		p2.setEmail(s);
		assertEquals("vboyack@csus.edu", p2.getEmail());
	}
	
	@Test
	public void setAddresstest() {
		String s = "6000 J Street, Sacramento, CA 95819";
		p2.setAddress(s);
		assertEquals("6000 J Street, Sacramento, CA 95819", p2.getAddress());
	}
	
	@Test
	public void setUsernametest() {
		String s = "vboyack";
		p2.setUsername(s);
		assertEquals("vboyack", p2.getUsername());
	}
	
	@Test
	public void setPhonetest() {
		String s = "(916)278-6011";
		p2.setPhone(s);
		assertEquals("(916)278-6011", p2.getPhone());
	}
	
	@Test
	public void setPasswordtest() {
		String s = "abc123";
		p2.setPassword(s);
		assertEquals("abc123", p2.getPassword());
	}
	
	@Test
	public void setVehicletest() {
		Vehicle v = new Vehicle(year, make, model, license, permit);
		p2.setVehicle(v);
		assertEquals(v, p2.getVehicle());
	}
	
	@Test
	public void setReservationtest() {
		Reservation r = new Reservation(0, 0, 0);
		p2.setReservation(r);
		assertEquals(r, p2.getReservation());
	}
}
