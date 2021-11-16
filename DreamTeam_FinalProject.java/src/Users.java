import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;




public class Users{
	
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
