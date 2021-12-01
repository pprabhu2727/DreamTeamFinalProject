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

	private static ArrayList<Users> listOfUsers = new ArrayList<Users>();
	private static Users loggedInUser = null; // Used to hold the instance of a user who successfully logged in
	private static Scanner s = new Scanner(System.in);
	public static void login(Scanner in) throws Exception{
		
		String greeting = "Welcome. Please login or register to continue.";
        String username;
        String password;
        
        
      
    
	
		System.out.println(greeting);
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
		        username = s.next();   
		        System.out.println("Please type your password :");
		        password = s.next();
			
				accountFileReader("Output.txt");		
				
		     
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
					Reservation r = new Reservation();
					Users user = new Users();
					Vehicle v = new Vehicle();
						System.out.print(" Enter Username: ");
						username = s.nextLine();
						user.setUsername(username);
						printToFile("\n");
						printToFile(username);
			
						System.out.print(" Enter Password: ");
						password = s.nextLine();
						user.setPassword(password);
						printToFile(password);

						System.out.print(" Enter Name: ");
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

						System.out.print(" Enter the make of your Vehicle : ");
						String Make = s.nextLine();
						v.setMake(Make);
						printToFile(Make);

						System.out.print(" Enter the Model of your Vehicle : ");
						String Model = s.nextLine();
						v.setModel(Model);
						printToFile(Model);

						System.out.print(" Enter the year of your Vehicle : ");
						String Year = s.nextLine();
						v.setYear(Year);
						printToFile(Year);
						
						System.out.print(" Enter the license number of your Vehicle : ");
						String License = s.nextLine();
						v.setLicense(License);
						printToFile(License);

						System.out.print(" Enter the Permit number of your Vehicle : ");
						String Permit = s.nextLine();
						v.setPermit(Permit);
						printToFile(Permit);

						System.out.print(" Do you have an existing Reservation? (yes or no): ");
						String Reservation = s.nextLine();
						r.setReservation(true);
						r.setReser(Reservation);
						printToFile(Reservation);

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
			p.print(print + ";");
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
					String Reservation =  stringTokenizer.nextToken();
					if(Reservation.equalsIgnoreCase("no")){
						b = false;
					}
					if(Reservation.equalsIgnoreCase("yes")){
						b = true;
					}
					Reservation R = new Reservation(b);
					Users vehicle = new Users();


					Vehicle v = new Vehicle(Year,Make,Model, License, Permit);
					vehicle.setVehicle(v);
					listOfUsers.add(new Users(Name, email, address, Username, Password, Phone,v,R));

					for(Users u: listOfUsers){
						System.out.print(u);
					}
				}
				
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: couldn't find file");
			e.printStackTrace();
		}
	}
	

}
