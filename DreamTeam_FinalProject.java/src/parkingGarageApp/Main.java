package parkingGarageApp;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//import javax.lang.model.util.ElementScanner14;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static CampusParking parking = CampusParking.createInstance();
	public static Users currentUser = null;
	static Reservation r = new Reservation();
	
	public static void main(String[] args) throws Exception {
		LoginManager.login(in);
		
		currentUser = LoginManager.getLoggedInUser();
		
		// Menu (main program loop)
		menu();
	}
	
	/*
	 * Main program loop
	 */
	public static void menu() {
		char userSelection;
		boolean isQuit = false;
		
		do {
			printMenu();
			userSelection = in.next().charAt(0);
			 
			switch(userSelection) {
			case 'M': 
			case 'm':
				printMap();
				break;
			
			case 'R':
			case 'r':
				// TODO: add reservation functionality 
				System.out.println("Reserving...");
				if(currentUser.getReservation() == null)
				r.makeReserv(currentUser);
				
				break;
				
			case 'D':
			case 'd':
				if (currentUser.getReservation() == null) {
					// in case of selection, treat as invalid
					System.out.println("Please enter a valid command.\n");
				} else {
					// TODO: show reservation details
					System.out.println("Showing reservation details...");
					System.out.println(r);
				}
				break;
			
			case 'C':
			case 'c':
				if (currentUser.getReservation() == null) {
					// in case of selection, treat as invalid
					System.out.println("Please enter a valid command.\n");
				} else {
					currentUser.setReservation(null);
				}
				break;
				
			case 'Q':
			case 'q':
				isQuit = true;
				break;
				
			default:
				System.out.println("Please enter a valid command.\n");
			}
		} while (!isQuit);
		
	}

	/*
	 * Prints menu options
	 */
	public static void printMenu() {
		System.out.println("What would you like to do?");
		System.out.println("  Enter M to view map");
		System.out.println("  Enter R to make a reservation");
		if (currentUser.getReservation() != null) {
			// Only print these options if user has a reservation
			System.out.println("  Enter D to get details for a reservation");
			System.out.println("  Enter C to cancel a reservation");
		}
		System.out.println("  Enter Q to quit");
		
	}
	
	/*
	 * Asks for and prints the requested floor
	 * For menu option M
	 */
	public static void printMap() {
		int garageNum = -1;	// No selection to begin with
		int floorNum = -1;
		boolean garageNumValid = false;
		boolean floorNumValid = false;
		
		// Get garage from user (checks for invalid inputs)
		do {
			System.out.println("Please enter the garage number (1 - " + CampusParking.NUM_GARAGES + "): ");
			
			// Check for input that isn't a number
			try {
				garageNum = in.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("  Please enter a number...");
				in.nextLine(); // clears the buffer
			}
			
			// Check for input that isn't a valid number
			if (garageNum < 1 || garageNum > CampusParking.NUM_GARAGES) {
				System.out.println("  That garage number doesn't exist...");
			} else {
				garageNumValid = true;
			}
			
		} while(!garageNumValid);
		
		// Get floor from user (checks for invalid inputs)
		do {
			System.out.println("Please enter the floor number (1 - " + CampusParking.FLOORS_PER_GARAGE + "): ");
			
			// Check for input that isn't a number
			try {
				floorNum = in.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("  Please enter a number...");
				in.nextLine(); // clears the buffer
			}
			
			// Check for input that isn't a valid number
			if (floorNum < 1 || floorNum > CampusParking.FLOORS_PER_GARAGE) {
				System.out.println("  Incorrect floor number...");
			} else {
				floorNumValid = true;
			}
			
		} while(!floorNumValid);
		
		GarageFloorPrinter.print(garageNum, floorNum);
	}
}