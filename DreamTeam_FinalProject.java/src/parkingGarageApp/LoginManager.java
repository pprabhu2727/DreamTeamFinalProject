package parkingGarageApp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LoginManager {

	private static ArrayList<Users> listOfUsers = new ArrayList<Users>();
	private static Users loggedInUser = null; // Used to hold the instance of a user who successfully logged in
	
	public static void login() throws Exception{
		
		String greeting = "Welcome. Please login or register to continue.";
        String username;
        String password;
        
        
      
    
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
		        username = s.next();   
		        System.out.println("Please type your password :");
		        password = s.next();
			
				Reader("Output.txt");		
				//Valid(username,password);
		     
		    
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
						System.out.print(" Enter Username: ");
						username = scanner.nextLine();
						users.setUsername(username);
						printToFile(username);
			
						System.out.print(" Enter Password: ");
						password = scanner.nextLine();
						users.setPassword(password);
						printToFile(password);

						System.out.print(" Enter Name ");
						String Name = scanner.nextLine();
						users.setEmail(Name);
						printToFile(Name);
			
						System.out.print(" Enter Email: ");
						String email = scanner.nextLine();
						users.setEmail(email);
						printToFile(email);
			
						System.out.print(" Enter Address: ");
						String address = scanner.nextLine();
						users.setEmail(address);
						printToFile(address);
			
						System.out.print(" Enter Phone Number: ");
						String phone = scanner.nextLine();
						users.setPhone(phone);
						printToFile(phone);
						scanner.close();
				case 3:
				System.out.print(loggedInUser.toString());
				
				// Delete later, just for bypassing login system
				case 4:
					loggedInUser = listOfUsers.get(0);
					
				break;
				
			}
		
		}while(option !=4);
		
	}
	
	public static Users getLoggedInUser() {
		return loggedInUser;
	}

static void printToFile(String print) throws IOException {
	
	FileWriter f= new FileWriter( new File("Output.txt"), true);
	BufferedWriter b = new BufferedWriter(f);
	PrintWriter p = new PrintWriter(b);
	p.print(print + ",");
	p.close();
  

}

public static void Reader(String FileName) throws IOException{

	try {
		BufferedReader br;
		br = new BufferedReader(new FileReader(FileName));
		String line = br.readLine();
	

	StringTokenizer stringTokenizer = new StringTokenizer(line,";");
	while(stringTokenizer.hasMoreTokens()){
		String Username = stringTokenizer.nextToken();
		String Password = stringTokenizer.nextToken();
		String Name = stringTokenizer.nextToken();
		String email= stringTokenizer.nextToken();
		String address =stringTokenizer.nextToken();
		String Phone = stringTokenizer.nextToken();

		
		listOfUsers.add(new Users(Name, email, address, Username, Password, Phone));
	
		
	}
	
	br.close();

	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}



}

}
