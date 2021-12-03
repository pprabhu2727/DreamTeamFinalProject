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
	
	//this test should work when reservation class is done
	@Test
	public void getReservationtest() {
		boolean b = true;
		Vehicle p = new Vehicle(year, make, model, license, permit);
		Reservation r = new Reservation(b);
		Users a = new Users("", "", "", "", "", "", p, r);
		assertEquals(p, a.getReservation());
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
		Users p = new Users("", "", "", "", "", "");
		p.setName(s);
		assertEquals("Randall Boggs", p.getName());
	}
	
	@Test
	public void setEmailtest() {
		String s = "vboyack@csus.edu";
		Users p = new Users("", "", "", "", "", "");
		p.setEmail(s);
		assertEquals("vboyack@csus.edu", p.getEmail());
	}
	
	@Test
	public void setAddresstest() {
		String s = "6000 J Street, Sacramento, CA 95819";
		Users p = new Users("", "", "", "", "", "");
		p.setAddress(s);
		assertEquals("6000 J Street, Sacramento, CA 95819", p.getAddress());
	}
	
	@Test
	public void setUsernametest() {
		String s = "vboyack";
		Users p = new Users("", "", "", "", "", "");
		p.setUsername(s);
		assertEquals("vboyack", p.getUsername());
	}
	
	@Test
	public void setPhonetest() {
		String s = "(916)278-6011";
		Users p = new Users("", "", "", "", "", "");
		p.setPhone(s);
		assertEquals("(916)278-6011", p.getPhone());
	}
	
	@Test
	public void setPasswordtest() {
		String s = "abc123";
		Users p = new Users("", "", "", "", "", "");
		p.setPassword(s);
		assertEquals("abc123", p.getPassword());
	}
	
	@Test
	public void setVehicletest() {
		Vehicle v = new Vehicle(year, make, model, license, permit);
		Users p = new Users("", "", "", "", "", "", null);
		p.setVehicle(v);
		assertEquals(v, p.getVehicle());
	}
	
	//this test should work when reservation class is done
	@Test
	public void setReservationtest() {
		boolean b = true;
		Vehicle p = new Vehicle(year, make, model, license, permit);
		Reservation r = new Reservation(b);
		Users a = new Users("", "", "", "", "", "", p, null);
		a.setReservation(r);
		assertEquals(p, a.getReservation());
	}
}
