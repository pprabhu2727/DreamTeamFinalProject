 import java.io.IOException;
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
				// TODO: add map printing
				System.out.println("Loading map...");
				break;
			
			case 'R':
				// TODO: add reservation functionality 
				System.out.println("Reserving...");
				break;
				
			case 'Q':
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
}