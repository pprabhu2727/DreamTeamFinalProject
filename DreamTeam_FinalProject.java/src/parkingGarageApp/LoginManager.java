package parkingGarageApp;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LoginManager {

	public static ArrayList<Users> listOfUsers = new ArrayList<Users>();
	public static Users loggedInUser = null; // Used to hold the instance of a user who successfully logged in
	
	public static boolean login(Scanner in) {
		
		String greeting = "Welcome. Please login or register to continue.";
	
		System.out.println(greeting);
		int option = -1;
		boolean isLoggedIn = false;
		
		do {
			System.out.println("  Enter 1 to Login");
	        System.out.println("  Enter 2 to Register");
			System.out.println("  Enter 3 to Show Account Information");
	        option = in.nextInt();
	        //in.nextLine(); // clear buffer
			
			try {
				isLoggedIn = loginMenu(in, option);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (!isLoggedIn);
		
		return isLoggedIn;
		
	}
	
	public static boolean loginMenu(Scanner in, int option) throws Exception {
			String username;
	        String password;	
			boolean isLoggedIn = false;
			
			switch(option){
		       case 1:

		        System.out.println("Please type your username :");
		        username = in.next();   
		        System.out.println("Please type your password :");
		        password = in.next();
			
				readAccountsFrom("Output.txt");		
				
				// TODO: iterator
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
					in.nextLine(); //clear buffer
					Reservation r = new Reservation();
					Users user = new Users();
					Vehicle v = new Vehicle();
						System.out.print(" Enter Username: ");
						username = in.nextLine();
						user.setUsername(username);
						printToFile("\n");
						printToFile(username);
			
						System.out.print(" Enter Password: ");
						password = in.nextLine();
						user.setPassword(password);
						printToFile(password);

						System.out.print(" Enter Name: ");
						String Name = in.nextLine();
						user.setEmail(Name);
						printToFile(Name);
			
						System.out.print(" Enter Email: ");
						String email = in.nextLine();
						user.setEmail(email);
						printToFile(email);
			
						System.out.print(" Enter Address: ");
						String address = in.nextLine();
						user.setEmail(address);
						printToFile(address);
			
						System.out.print(" Enter Phone Number: ");
						String phone = in.nextLine();
						user.setPhone(phone);
						printToFile(phone);

						System.out.print(" Enter the make of your Vehicle : ");
						String Make = in.nextLine();
						v.setMake(Make);
						printToFile(Make);

						System.out.print(" Enter the Model of your Vehicle : ");
						String Model = in.nextLine();
						v.setModel(Model);
						printToFile(Model);

						System.out.print(" Enter the year of your Vehicle : ");
						String Year = in.nextLine();
						v.setYear(Year);
						printToFile(Year);
						
						System.out.print(" Enter the license number of your Vehicle : ");
						String License = in.nextLine();
						v.setLicense(License);
						printToFile(License);

						System.out.print(" Enter the Permit number of your Vehicle : ");
						String Permit = in.nextLine();
						v.setPermit(Permit);
						printToFile(Permit);
						/*
						System.out.print(" Do you have an existing Reservation? (yes or no): ");
						String Reservation = in.nextLine();
						r.setReservation(true);
						r.setReser(Reservation);
						printToFile(Reservation);
						*/

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
			return isLoggedIn;
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
			p.print(print + ";");
		}
		
		p.close();
	  
	
	}
	
	/*
	 * Replaces Reader
	 * Reads in all accounts from Output.txt to listOfUsers array
	 */
	public static void readAccountsFrom(String fileName) throws IOException {
		try {
			Scanner in = new Scanner(new File(fileName));
			
			while(in.hasNextLine()) {
				String userInfo = in.nextLine();
				StringTokenizer stringTokenizer = new StringTokenizer(userInfo, ";");
				Boolean b = false;
				while(stringTokenizer.hasMoreTokens()){
					String Username = stringTokenizer.nextToken();
					String Password = stringTokenizer.nextToken();
					String Name = stringTokenizer.nextToken();
					String email= stringTokenizer.nextToken();
					String address =stringTokenizer.nextToken();
					String Phone = stringTokenizer.nextToken();
					String Make = stringTokenizer.nextToken();
					String Model = stringTokenizer.nextToken();
					String Year = stringTokenizer.nextToken();
					String License = stringTokenizer.nextToken();
					String Permit = stringTokenizer.nextToken();
					//String Reservation =  stringTokenizer.nextToken();
					
					// If this user has a reservation, there will be more tokens to read
					Vehicle v = new Vehicle(Year,Make,Model, License, Permit);
					Users user;
					/*
					if(Reservation.equalsIgnoreCase("yes")){
						String garageNum = stringTokenizer.nextToken();
						String floorNum = stringTokenizer.nextToken();
						String slotNum = stringTokenizer.nextToken();
						
						// TODO: Reservations.java needs this sort of constructor
						Reservation R = new Reservation(Integer.parseInt(garageNum), Integer.parseInt(floorNum), Integer.parseInt(slotNum)); 
						user = new Users(Name, email, address, Username, Password, Phone,v, R);
					} else {
						user = new Users(Name, email, address, Username, Password, Phone,v);
					}
					*/
					user = new Users(Name, email, address, Username, Password, Phone,v);
					listOfUsers.add(user);
					
					/*
					for(Users u: listOfUsers){
						System.out.print(u);
					} */
				}
				
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: couldn't find file");
			e.printStackTrace();
		}
	}
	

}
