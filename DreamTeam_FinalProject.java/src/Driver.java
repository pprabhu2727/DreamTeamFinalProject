import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Driver {

	public static void main(String[] args) throws IOException {
		String file = "userStrings.txt";
		Scanner keyboard = new Scanner(System.in);
		FileWriter fw = new FileWriter(file);
		StringTokenizer tokenizer;
		PrintWriter out;
		String name;
		String Email;
		String Address;
		String Username;
		String Password;
		long PhoneNumber;
		BufferedReader in;
	

	  	System.out.print("What is your name? ");
	         name = keyboard.nextLine();
	      	
	      	// Get the user's address.
	         System.out.print("What is your full address? ");
	         Address =  keyboard.nextLine();
	      	
	      	// Get the user's age.
			System.out.print("What is your Email Address? ");
			Email = keyboard.nextLine();
	      	
	      	// Get the user's phone number.
	         System.out.print("Type your 10-digit phone number:");
	         PhoneNumber = keyboard.nextLong(); 
	         
	         System.out.print("Type your Username: ");
	         Username = keyboard.next();
	         
	         System.out.print("Type your Password: ");
	         Password = keyboard.next();
	         
	         Users user = new Users(name, Email, Address, Username,  Password,  PhoneNumber);
	
	         System.out.println("Your name is " + user.getName());
	         
	         
	         System.out.println("Your address is " + user.getAddress());	
						
						
	         System.out.println("Your phone number is " + user.getPhone());
	         
	}
	         
	}
	


class Users{
	
	private String name;
	private String Email;
	private String Address;
	private String Username;
	private String Password;
	private long PhoneNumber;
	
	public Users(String name, String Email, String Address, String Username, String Password, long PhoneNumber) {
		this.name = name;
		this.Email = Email;
		this.Address = Address;
		this.Username = Username;
		this.Password = Password;
		this.PhoneNumber = PhoneNumber;
	
	}
	//Getters and Setters
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;	
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getEmail() {
		return this.Email;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public String getAddress() {
		return this.Address;
	}
	public void setUsername(String Email) {
		this.Email = Email;
	}
	public String getUsername() {
		return this.Email;
	}
	public void setPhone(long PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
	public long getPhone() {
		return this.PhoneNumber;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
	public String getPassword() {
		return this.Password;
	}
	
}
