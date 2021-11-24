package tests;
import parkingGarageApp.Users;
import static org.junit.Assert.*;

import org.junit.Test;

public class UsersTest {

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
}
