package tests;
import parkingGarageApp.Admin;
//import parkingGarageApp.Users;
import static org.junit.Assert.*;

import org.junit.Test;

public class AdminTest {

	@Test
	public void getCodetest() {
		String s = "Access Code";
		Admin a = new Admin("", "", "", "", "", "", s);
		assertEquals("Access Code", a.getCode());
	}

	@Test
	public void setCodetest(){
		String accessCode = "Access Code";
		Admin a = new Admin("", "", "", "", "", "", "");
		a.setCode(accessCode);
		assertEquals("Access Code", a.getCode());
	}
	
	@Test
	public void toStringtest(){
		String name = "Randall";
		String email = "vboyack@csus.edu";
		String address = "6000 J Street, Sacramento, CA 95819";
		String phone = "(916)278-6011";
		String code = "Access Code";
		String s = "User Info: \n Name: " + name + "\n Email " + email + "\n Address " + address + "\n Phone " + phone + "\n Access Code:" + code; 
		Admin a = new Admin(name, email, address, "", "", phone, code);
		assertEquals(s, a.toString());
	}
}
