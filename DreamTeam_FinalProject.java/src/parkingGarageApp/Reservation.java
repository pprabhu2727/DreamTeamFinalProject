package parkingGarageApp;
import java.io.IOException;
import java.util.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedExceptions;


public class Reservation {
	
	Reservation reserve;
	
	//testing to see if created
	public void test() {
		reserve = new Reservation();
	}
	
	static Scanner key = new Scanner(System.in);
	static Scanner o = new Scanner(System.in);
	
/*
	public void checkSpot() {
		
		System.out.println("Input the floor number that you would like to book from. \n");
		int floorNumber = key.nextInt();
		System.out.println("Input parking space # that you would like to book.\n");
		int spotNumber = key.nextInt();
		
		checkspot.getSpotName(String spotName); //something like this... fix later
		
		if (spotName == null) {							//getAvailability?
			System.out.println("Spot is empty");
		}
		else {
			reserve.checkSpace(spotName);			//make a class to check spot
			System.out.println("Spot is currently filled by, " + spotName);			//loop back?
		}
	}
*/
	
	int choice;

		System.out.println(" Option 1 to reserve");
		System.out.println(" Option 2 to cancel reservation");
		System.out.println(" Option 3 to do a quick reservation");
		System.out.println(" Option 4 to Exit");

		choice = o.nextInt();

		do{
			switch(choice){
				case 1:

				@SuppressWarnings("unused")	//I have no clue affects spotNumber
				public void reserveSpot() throws IOException{
					
					System.out.println("Input the time range that you would like to book for. (Military Time) \n Example: 12.30(enter), 16.30(enter)");
					double timeNumber = key.nextDouble();
					double timeNumber2 = key.nextDouble();
					System.out.println("What name would you like to have this spot named under? ");
					String spotName = key.toString();
					
					reserve.reserveParkingSpot(spotName, floorNumber, spotNumber, timeNumber, timeNumber2);
					System.out.println("The spot you have choosen has now been booked from, " + timeNumber + " - " + timeNumber2 + ".\n");
				}
				public class information {
						private String Name;
						private double floorNumber;
						private String spotName;
						private double timeNumber;
						private double timeNumber2;
			
						public void information (String Name, double floorNumber, double timeNumber, double timeNumber2)
						{
							this.Name = Name;
							this.floorNumber = floorNumber;
							this.timeNumber = timeNumber;
							this.timeNumber2 = timeNumber2;
						}
				public information() {
			
				}
				public void setName(String Name){
					this.Name = Name;
				}
				public String getName(){
					return this.Name;
				}
				public void setfloorNumber(double floorNumber){
					this.floorNumber = floorNumber;
				}
				public double getfloorNumber(){
					return this.floorNumber;
				}
				}
				/*break;

				case 2:

				//Cancel reservation through spot location?
				//break;

				case 3:

				//Implement Map iteration for open slot


			
				}
				*/
		}while(choice !=4);
}