package parkingGarageApp;
import java.io.IOException;
import java.util.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedExceptions;


public class Reservation {
	
	static Scanner key = new Scanner(System.in);
	static Scanner o = new Scanner(System.in);
	static Scanner g = new Scanner(System.in);
	static Scanner f = new Scanner(System.in);
	static Scanner s = new Scanner(System.in);
	private ParkingGarage pg;
	private ParkingSlot ps;
	private Users user;
	int choice, gChoice, fChoice, sChoice;
	int garageNumber, floorNumber, slotNumber;
	Boolean reservation;
	public Reservation(){

	}
	public Reservation(Boolean Reservation){
		this.Reservation = Reservation;
	}
	public String getReser(){
		return Reser;
	}
	public void setReser(String Reser){
		this.Reser =  Reser;
	}
	public boolean getReservation(){
		return Reservation;
	}
	public void setReservation(Boolean Reservation){
		this.Reservation = Reservation;
	}


	public void makeReserv(int garageNumber, int floorNumber, int slotNumber){

		System.out.println(" Please enter a garage number you'd like to reserve from: ");
		gChoice = g.nextInt();
		System.out.println(" Please enter a floor number you'd like to reserve from: ");
		fChoice = f.nextInt();
		System.out.println(" Please enter a slot number you'd like to reserve: ");
		sChoice = s.nextInt();
	
		for(int i = 1; i <= CampusParking.getGarageList().size(); i++) {
			if(gChoice == i) {
				garageNumber = i;
				for(int j = 1; j <= CampusParking.getGarageList().get(i).getNumberOfFloors(); j++) {
					if(fChoice == j){
						floorNumber = j;
						for(int k = 0; k < CampusParking.SLOTS_PER_FLOOR; k++) {
							if(sChoice == k && ps.getAvailability() == true) {
								slotNumber = k;
								ps.changeAvailability();
								ps.setUser(user);
								reservation = true;
								break;
							}
						}
					}
				}
			}
		}
		public String toString(){
			return "Your reservation has been set for Garage:" +garageNumber +" Floor:" +floorNumber +" and Slot number:" +slotNumber;
		}
	}

public void quickReserv(){
	boolean foundSlot = false;
	while(!foundSlot){
	for(int i=1; i<=CampusParking.getGarageList().size(); i++) {
		for(int j=1; j<=CampusParking.getGarageList().get(0).getNumberOfFloors();j++) {			
			for(int k=0; k< CampusParking.SLOTS_PER_FLOOR; k++) {
				boolean slotAvailability = CampusParking.getGarageList().get(i-1).getFloorList().get(j-1).getSlots().get(k-1).getAvailability();
					if (slotAvailability == true){
						ps.changeAvailability();
						ps.setUser(user);
						reservation = true;
						garageNumber = i;
						floorNumber = j;
						slotNumber = k;
						foundSlot = true;
					}
				}
			}
		}
	}
	public String toString(){
		return "Your reservation has been set for Garage:" +garageNumber +" Floor:" +floorNumber +" and Slot number:" +slotNumber;
	}
}

/*



*/