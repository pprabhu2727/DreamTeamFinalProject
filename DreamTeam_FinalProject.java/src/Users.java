import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;




public class Users{
	
	private String name;
	private String Email;
	private String Address;
	private String Username;
	private String Password;
	private String PhoneNumber;
	
	public Users(String name, String Email, String Address, String Username, String Password, String PhoneNumber) {
		this.name = name;
		this.Email = Email;
		this.Address = Address;
		this.Username = Username;
		this.Password = Password;
		this.PhoneNumber = PhoneNumber;
	
	}

	public Users() {
		
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
	public void setUsername(String Username) {
		this.Username = Username;
	}
	public String getUsername() {
		return this.Username;
	}
	public void setPhone(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
	public String getPhone() {
		return this.PhoneNumber;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
	public String getPassword() {
		return this.Password;
	}
	public String toString(){
		return "User Info: Name: " + this.name + "\n Email \n" + this.name + " ";
	}
	
}
