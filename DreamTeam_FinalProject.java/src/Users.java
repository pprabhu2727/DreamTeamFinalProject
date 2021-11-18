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
 class Login{


	public static void main(String[] args)throws IOException{
		
		String greeting = "Welcome to login to reserve parking";
        String username;
        String password;

        // Used to hold the instance of a user who successfully logged in
        Users loggedInUser = null;
   
        // Create an empty list to hold users
        ArrayList<Users> listOfUsers = new ArrayList<Users>();
        
        // Add users to the list
        listOfUsers.add(new Users("Rayman", "email@email.com","Address","ThandiR","password","9166666666"));
		listOfUsers.add(new Users("Joe", "email@email.com","Address","ThandiR","Pass","9166666666"));
     
      
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		System.out.println(greeting);
		
		int option = -1;
	
		do{

            System.out.println("Enter 1 to login");
            System.out.println("Enter 2 to Resigter");
			System.out.println("Enter 3 to Show Information");
			System.out.println("Enter 3 to Quit");
            option = s.nextInt();

    
	switch(option){
       case 1:
        
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
            System.out.println("User successfully logged in: "+loggedInUser.getName());
        }
        else
        {
            System.out.println("Invalid username/password");
        }
			break;
		case 2:
			Users users = new Users();
			Scanner scanner = new Scanner(System.in);
				System.out.print(" Enter Name ");
				String Name = scanner.nextLine();
				users.setName(Name);
	
				System.out.print(" Enter userName ");
				username = scanner.nextLine();
				users.setUsername(username);
	
				System.out.print(" Enter password => ");
				password = scanner.nextLine();
				users.setPassword(password);
	
				System.out.print(" Enter emailId => ");
				String emailId = scanner.nextLine();
				users.setEmail(emailId);
	
				System.out.print(" Enter phoneNo => ");
				String phoneNo = scanner.nextLine();
				users.setPhone(phoneNo);
			
				listOfUsers.add(new Users(Name, emailId, emailId, username, password, phoneNo));
		case 3:
		Users user = new Users();
		System.out.print(user.toString());
		break;

}
		}while(option !=4);
		s.close();
	}
}


