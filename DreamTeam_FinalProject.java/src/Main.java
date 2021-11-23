 import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO: Initialization tasks 
		CampusParking.createInstance();
		
		// TODO: Login system
		try {
			LoginManager.login();
		} catch (IOException e) {
			System.out.println("Login error: " + e.getMessage());
		}
		
		// TODO: Menu (main program loop)
		menu();
		
	}
	
	/*
	 * Main program loop
	 */
	private static void menu() {
		Scanner in = new Scanner(System.in);
		char userSelection;
		boolean isQuit = false;
		
		do {
			printMenu();
			userSelection = in.next().charAt(0);
			
			switch(userSelection) {
			case 'M': 
			case 'm':
				printMap(in);
				break;
			
			case 'R':
			case 'r':
				// TODO: add reservation functionality 
				System.out.println("Reserving...");
				break;
				
			case 'Q':
			case 'q':
				isQuit = true;
				break;
				
			default:
				System.out.println("Please enter a valid command.\n");
			}
		} while (!isQuit);
		
		in.close();
	}

	/*
	 * Prints menu options
	 */
	private static void printMenu() {
		System.out.println("What would you like to do?");
		System.out.println("  Enter M to view map");
		System.out.println("  Enter R to reserve");
		System.out.println("  Enter Q to quit");
		
	}
	
	/*
	 * Asks for and prints the requested floor
	 * For menu option M
	 */
	private static void printMap(Scanner in) {
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
		
		GarageFloorPrinter.print(garageNum - 1, floorNum - 1); // Internally garages and floors start at 0
	}
}