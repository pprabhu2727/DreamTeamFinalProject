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


	@Test
    public void loginTest() throws Exception {
		ArrayList<Users> listOfUsers = new ArrayList<Users>();
		listOfUsers.add(new Users("String name", "String Email", "String Address", "String Username", "String Password", "String PhoneNumber",new Vehicle("String Year", "String Make", "String Model", "String License", "String Permit"),new Reservation(1,1,1)));
		Users loggedInUser = null;
    	String greeting = "Welcome. Please login or register to continue.";
    	Scanner in = new Scanner(System.in);
    	LoginManager.login(in);
   
    	
    }
	@Test
    public void readAccountTest() throws Exception {
		File f = new File("Output.txt");
		LoginManager.readAccountsFrom("Output.txt");
    	
    }
}
