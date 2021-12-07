package tests;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import parkingGarageApp.LoginManager;
import parkingGarageApp.Reservation;
import parkingGarageApp.Users;
import parkingGarageApp.Vehicle;

import org.junit.Test;

public class LoginManagerTest {

	Scanner in = new Scanner(System.in);
	
	@Test
    public void testLoginMenu() throws Exception {
		// Inputs: username and password of a user already in Output.txt
    	assertTrue(LoginManager.loginMenu(in, 1) == true);
    	// Inputs: enter info for user registration
    	assertTrue(LoginManager.loginMenu(in, 2) == true);
    	assertTrue(LoginManager.loginMenu(in, 3) == false);
    }
	
	@Test
	public void testLogin() {
		assertTrue(LoginManager.login(in) == true);
	}
	
	@Test
	public void getLoggedInUserTest() {
		Users loggedInUser = LoginManager.getLoggedInUser();
		assertEquals(loggedInUser, LoginManager.getLoggedInUser());
	}
	
	@Test
    public void readAccountTest() throws Exception {
		//File f = new File("Output.txt");
		LoginManager.readAccountsFrom("Output.txt");
    	
    }
}
