package parkingGarageApp;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

public void quickReserv(Users u ){
	boolean foundSlot = false;
	while(!foundSlot){
	for(int i=1; i<=CampusParking.getGarageList().size()-1; i++) {
		for(int j=1; j<=CampusParking.getGarageList().get(0).getNumberOfFloors()-1;j++) {			
			for(int k=0; k< CampusParking.SLOTS_PER_FLOOR-1; k++) {
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
	Reservation res= new Reservation(garageNumber,floorNumber,slotNumber);
		u.setReservation(res);
}


	public String toString(){
		return "Your reservation has been set for Garage:" +garageNumber +" Floor:" +floorNumber +" and Slot number:" +slotNumber;
	}
}

/*
static void printToFile(String print) throws IOException {
	File file = new File("Output.txt");
	FileWriter f= new FileWriter( new File(file), true);
	BufferedWriter b = new BufferedWriter(f);
	PrintWriter p = new PrintWriter(b);
	if(user.getUsername == )

	
	p.close();
  



*/