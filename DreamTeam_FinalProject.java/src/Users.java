import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class Users{
	
	private String name;
	private String Email;
	private String Address;
	private String Username;
	private String Password;
	private long PhoneNumber;
	HashMap <String,String> Login = new HashMap<String,String>();
	public Users(String name, String Email, String Address, String Username, String Password, long PhoneNumber) {
		this.name = name;
		this.Email = Email;
		this.Address = Address;
		this.Username = Username;
		this.Password = Password;
		this.PhoneNumber = PhoneNumber;
	
	}
	public Users(String Username, String Password){
		this.Username = Username;
		this.Password = Password;
	}
	public Users() {
		// TODO Auto-generated constructor stub
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
	public void IDPass(){
		Login.put("Rayman","Thandi");


	}
	public HashMap Info(){

		return Login;
	}
	
}
 class Login{


	public static void main(String[] args)throws IOException{
		
		String greeting = "Welcome to login to reserve parking";
        String username;
        String password;

        // Used to hold the instance of a user who successfully logged in
        Users loggedInUser = null;
   
        // Create an empty list to hold users
        ArrayList<Users> listOfUsers = new ArrayList<Users>();
        
        // Add 3 users to the list
        listOfUsers.add(new Users("Rayman","Thandi"));
        listOfUsers.add(new Users("Test","Password"));
        listOfUsers.add(new Users("Rayman","Thandi"));
        // Get user input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        System.out.println(greeting);
        System.out.println("Please type your username :");
        username = br.readLine();   
        System.out.println("Please type your password :");
        password = br.readLine();

        // Iterate through list of users to see if we have a match
        Iterator<Users> iterator = listOfUsers.iterator();
        for (Users user : listOfUsers)
        {
     
            if (username.equals(user.getUsername()) && password.equals(user.getPassword()))
            {
               
                    loggedInUser = user;

                    // when a user is found, "break" stops iterating through the list
                    break;
                
            }
        }

        // if loggedInUser was changed from null, it was successful
        if (loggedInUser != null)
        {
            System.out.println("User successfully logged in: "+loggedInUser.getUsername());
        }
        else
        {
            System.out.println("Invalid username/password combination");
        }
    }

}

