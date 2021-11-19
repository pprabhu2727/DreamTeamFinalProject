import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LoginManager {

	private static ArrayList<Users> listOfUsers = new ArrayList<Users>();
	
	public static void login() throws IOException{
		
		String greeting = "Welcome. Please login or register to continue.";
        String username;
        String password;

        // Used to hold the instance of a user who successfully logged in
        Users loggedInUser = null;
        
        // Add users to the list
        listOfUsers.add(new Users("Rayman", "email@email.com","Address","ThandiR","password","9166666666"));
		listOfUsers.add(new Users("Joe", "email@email.com","Address","ThandiR","password","9166666666"));
     
      
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		System.out.println(greeting);
		
		int option = -1;
	
		do{

            System.out.println("  Enter 1 to Login");
            System.out.println("  Enter 2 to Register");
			System.out.println("  Enter 3 to Show Information");
			System.out.println("  Enter 4 to Continue (temporary bypass for login system)");
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
	}	
		
}
