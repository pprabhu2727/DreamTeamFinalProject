package parkingGarageApp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LoginManager {

	private static ArrayList<Users> listOfUsers = new ArrayList<Users>();
	private static Users loggedInUser = null; // Used to hold the instance of a user who successfully logged in
	
	public static void login() throws Exception{
		
		String greeting = "Welcome. Please login or register to continue.";
        String username;
        String password;
        
        // Add users to the list
     	//listOfUsers.add(new Users("Rayman", "email@email.com","Address","ThandiR","password","9166666666"));
		//listOfUsers.add(new Users("Joe", "email@email.com","Address","ThandiR","password","9166666666"));
		
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		System.out.println(greeting);
		boolean found = false;
		int option = -1;
	
		do{

            System.out.println("  Enter 1 to Login");
            System.out.println("  Enter 2 to Register");
			System.out.println("  Enter 3 to Show Information");
			System.out.println("  Enter 4 to Continue (temporary bypass for login system)");
            option = s.nextInt();

    
			switch(option){
		       case 1:
				Scanner input = new Scanner(new File("Output.txt"));
			
		        System.out.println("Please type your username :");
		        username = br.readLine();   
		        System.out.println("Please type your password :");
		        password = br.readLine();
		try{
				while(input.hasNext() && !found){
				String	FileUser = input.next();
				String	FilePassword= input.next();
				if (FileUser.trim().equals(username.trim()) && password.trim().equals(password.trim())){
						found = true;
				}
				String name = input.next();
				String email = input.next();
				String addy = input.next();
				String phone = input.next(); 
				listOfUsers.add(new Users(name, email, addy, FileUser, password, phone));
				}
				input.close();
				System.out.println("Successful login");
				
		}catch(Exception e){
			System.out.print("Invalid Password/Username");
		}
		        //Iterate through list of users to see if we have a match
		     //  Iterator<Users> iterator = listOfUsers.iterator();
				
		      // for (Users user : listOfUsers)
		     //   {

		         //   if (username.equals(getUsername()) && password.equals(getPassword()))
		         //   {
		               
		             //    loggedInUser = user;
		
		           
		              //      break;
		                
		        //  }
		      //  }
		
		        // if loggedInUser was changed from null, it was successful
		       // if (loggedInUser != null)
		       // {
		       //     System.out.println("User successfully logged in: "+loggedInUser.getName());

					
		     //   }
		       // else
		      //  {
		      //      System.out.println("Invalid username/password");
		       // }
				//	break;
				case 2:
					Users users = new Users();
					Scanner scanner = new Scanner(System.in);
						System.out.print(" Enter Username: ");
						username = scanner.nextLine();
						users.setUsername(username);
						printString(username);
			
						System.out.print(" Enter Password: ");
						password = scanner.nextLine();
						users.setPassword(password);
						printString(password);

						System.out.print(" Enter Name ");
						String Name = scanner.nextLine();
						users.setEmail(Name);
						printString(Name);
			
						System.out.print(" Enter Email: ");
						String email = scanner.nextLine();
						users.setEmail(email);
						printString(email);
			
						System.out.print(" Enter Address: ");
						String address = scanner.nextLine();
						users.setEmail(address);
						printString(address);
			
						System.out.print(" Enter Phone Number: ");
						String phone = scanner.nextLine();
						users.setPhone(phone);
						printString(phone);
			
						listOfUsers.add(new Users(Name, email, address, username, password, phone));
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
static void printString(String s) throws Exception {
		FileWriter f= new FileWriter( new File("Output.txt"), true);
		BufferedWriter b = new BufferedWriter(f);
		PrintWriter p = new PrintWriter(b);
		p.print(s);
		p.close();
}	
static void printToFile(String print) throws IOException {
	
	FileWriter f= new FileWriter( new File("Output.txt"), true);
	BufferedWriter b = new BufferedWriter(f);
	PrintWriter p = new PrintWriter(b);
	p.print(print + ",");
	p.close();
  

}

}
