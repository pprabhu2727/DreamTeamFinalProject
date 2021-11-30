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
	
	public static void login(Scanner s) throws Exception{
        
		//Scanner s = new Scanner(System.in);
		System.out.println("Welcome. Please login or register to continue.");
		int option = -1;
		boolean isLoggedIn = false;
	
		do{
			
            System.out.println("  Enter 1 to Login");
            System.out.println("  Enter 2 to Register");
			System.out.println("  Enter 3 to Show Account Information");
            option = s.nextInt();
            s.nextLine(); // clear buffer
			
			switch(option){
		       case 1:

		    	   System.out.println("Please type your username :");
		    	   String username = s.next();   
		    	   System.out.println("Please type your password :");
		    	   String password = s.next();
		    	   
		    	   accountFileReader("Output.txt");
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
		    	   
		    	   isLoggedIn = true;
		    	   break;
		      
				case 2:
					Users user = new Users();
						System.out.print(" Enter Username: ");
						username = s.nextLine();
						user.setUsername(username);
						printToFile("\n");
						printToFile(username);
			
						System.out.print(" Enter Password: ");
						password = s.nextLine();
						user.setPassword(password);
						printToFile(password);

						System.out.print(" Enter Name ");
						String Name = s.nextLine();
						user.setEmail(Name);
						printToFile(Name);
			
						System.out.print(" Enter Email: ");
						String email = s.nextLine();
						user.setEmail(email);
						printToFile(email);
			
						System.out.print(" Enter Address: ");
						String address = s.nextLine();
						user.setEmail(address);
						printToFile(address);
			
						System.out.print(" Enter Phone Number: ");
						String phone = s.nextLine();
						user.setPhone(phone);
						printToFile(phone);
					
					loggedInUser = user;
					isLoggedIn = true;
					break;
					
				case 3:
					if(isLoggedIn) {
						System.out.print(loggedInUser.toString());
					} else {
						System.out.println("Please login or create an account.");
					}
					break;
				
			}
			s.nextLine();
		} while(!isLoggedIn);
		
	}
	
	public static Users getLoggedInUser() {
		return loggedInUser;
	}

	static void printToFile(String print) throws IOException {
		
		FileWriter f= new FileWriter( new File("Output.txt"), true);
		BufferedWriter b = new BufferedWriter(f);
		PrintWriter p = new PrintWriter(b);
		
		// Print newline if given
		if (print.equals("\n")) {
			p.print(print);
		} else {
			p.print(print + ",");
		}
		
		p.close();
	  
	
	}

	/* 
	 * fileReader based on this method but replaces it
	 * Using a scanner allows you to check for next lines in file
	 */
	/*
	public static void Reader(String FileName) throws IOException{
	
		try {
			BufferedReader br;
			br = new BufferedReader(new FileReader(FileName));
			String line = br.readLine();
	
			StringTokenizer stringTokenizer = new StringTokenizer(line,",");
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
	*/
	
	/*
	 * Replaces Reader
	 * Reads in all accounts from Output.txt to listOfUsers array
	 */
	public static void accountFileReader(String fileName) throws IOException {
		try {
			Scanner in = new Scanner(new File(fileName));
			
			while(in.hasNextLine()) {
				String userInfo = in.nextLine();
				StringTokenizer stringTokenizer = new StringTokenizer(userInfo, ",");
				
				while(stringTokenizer.hasMoreTokens()){
					String Username = stringTokenizer.nextToken();
					String Password = stringTokenizer.nextToken();
					String Name = stringTokenizer.nextToken();
					String email= stringTokenizer.nextToken();
					String address =stringTokenizer.nextToken();
					String Phone = stringTokenizer.nextToken();
					
					listOfUsers.add(new Users(Name, email, address, Username, Password, Phone));	
				}
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: couldn't find file");
			e.printStackTrace();
		}
	}
	

}
