package parkingGarageApp;

import java.util.*;




public class Reservation {
	
	static Scanner key = new Scanner(System.in);
	static Scanner o = new Scanner(System.in);
	static Scanner g = new Scanner(System.in);
	static Scanner f = new Scanner(System.in);
	static Scanner s = new Scanner(System.in);

	private ParkingSlot ps;
	private Users user;
	int choice, gChoice, fChoice, sChoice;
	int garageNumber, floorNumber, slotNumber;
	Boolean reservation;
	private String Reser;
	public Reservation(){

	}
	public Reservation(Boolean reservation){
		this.reservation = reservation;
	}
	public Reservation(int garageNumber, int floorNumber, int slotNumber){
		this.garageNumber = garageNumber;
		this.floorNumber = floorNumber;
		this.slotNumber = slotNumber;
	}
	public String getReser(){
		return Reser;
	}
	public void setReser(String Reser){
		this.Reser =  Reser;
	}
	public boolean getReservation(){
		return reservation;
	}
	public void setReservation(Boolean reservation){
		this.reservation = reservation;
	}


	public void makeReserv(Users u){
		int i;
		int j;
		int k;
		System.out.println(" Please enter a garage number you'd like to reserve from: ");
		gChoice = g.nextInt();
		System.out.println(" Please enter a floor number you'd like to reserve from: ");
		fChoice = f.nextInt();
		System.out.println(" Please enter a slot number you'd like to reserve: ");
		sChoice = s.nextInt();
	
		for(i = 1; i <= CampusParking.getGarageList().size(); i++) {
			if(gChoice == i) {
				garageNumber = i;
				for( j = 1; j <= CampusParking.getGarageList().get(i).getNumberOfFloors(); j++) {
					if(fChoice == j){
						floorNumber = j;
						for( k = 0; k < CampusParking.SLOTS_PER_FLOOR; k++) {
							ParkingSlot ps= new ParkingSlot(k);	
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
		Reservation res= new Reservation(garageNumber,floorNumber,slotNumber);
		u.setReservation(res);
	}

	public String toString(){
		return "Your reservation has been set for Garage:" +garageNumber +" Floor:" +floorNumber +" and Slot number:" +slotNumber;
	}
}

