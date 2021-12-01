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
	private Users users;
	private ParkingGarage pg;
	private ParkingSlot ps;
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


			public Reservation(int garageNumber, int floorNumber, int slotNumber)
			{
				
				System.out.println(" Option 1 to reserve");
				System.out.println(" Option 2 to cancel reservation");
				System.out.println(" Option 3 to do a quick reservation");
				System.out.println(" Option 4 to Exit");
				choice = o.nextInt();

				do{
					switch(choice){
						case 1:


							System.out.println(" Please enter a garage number you'd like to reserve from: ");
							gChoice = g.nextInt();
							System.out.println(" Please enter a floor number you'd like to reserve from: ");
							fChoice = f.nextInt();
							System.out.println(" Please enter a slot number you'd like to reserve: ");
							sChoice = s.nextInt();
						
							if(garageList.get(gChoice).getFloorList().get(fChoice).getSlots().get(sChoice).getAvailability == true)
							{
								ParkingSlot.changeAvailability;
								ParkingSlot.setUser;
								reservation = true;
							}
				
							break;

						case 2:

							//If users doesn't hold reservation value, use iteration loop from case 3 to match names to clear user and change availability.
							if(Users.getReservation == true)
							{
								Users.getReservation = false;
								ParkingSlot.changeAvailability;
								ParkingSlot.clearUser;
							
							}

							break;

						case 3:

							boolean foundSlot = false;
							while(!foundSlot){
									for(int i=1; i<=garageList.size(); i++) {
										for(int j=1; j<=garageList.get(0).getNumberOfFloors();j++) {			
											for(int k=0; k<numberOSlots; k++) {
												boolean slotAvailability = garageList.get(i).getFloorList().get(j).getSlots().get(k+1).getAvailability();
												if (slotAvailability == true){
													ParkingSlot.changeAvailability;
													ParkingSlot.setUser;
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
							break;
						
						
					
							
				
				
			}
		
		}while(choice == 4);
	}
	public String toString(){
		return "Your reservation has been set for Garage:" +garageNumber +" Floor:" +floorNumber +" and Slot number:" +slotNumber;

}

//Change cases to methods. Add a to string for details for reservation(garageN,FloorN,spotN)
//garageNumber = i;
//floorNumber = j;
//spotNumber = k
//^ add those to toString to display/save values onto txt

/*

public void makeReserv{
							System.out.println(" Please enter a garage number you'd like to reserve from: ");
							gChoice = g.nextInt();
							System.out.println(" Please enter a floor number you'd like to reserve from: ");
							fChoice = f.nextInt();
							System.out.println(" Please enter a slot number you'd like to reserve: ");
							sChoice = s.nextInt();
						
							if(garageList.get(gChoice).getFloorList().get(fChoice).getSlots().get(sChoice).getAvailability == true)
							{
								ParkingSlot.changeAvailability;
								ParkingSlot.setUser;
								reservation = true;
							}
}

public void cancelReserv{
							if(Users.getReservation == true)
							{
								Users.getReservation = false;
								ParkingSlot.changeAvailability;
								ParkingSlot.clearUser;
							
							}
}

public void quickResrv{
							int garageNumber, floorNumber, slotNumber;
							boolean foundSlot = false;
							while(!foundSlot){
									for(int i=1; i<=garageList.size(); i++) {
										for(int j=1; j<=garageList.get(0).getNumberOfFloors();j++) {			
											for(int k=0; k<numberOSlots; k++) {
												boolean slotAvailability = garageList.get(i).getFloorList().get(j).getSlots().get(k+1).getAvailability();
												if (slotAvailability == true){
													ParkingSlot.changeAvailability;
													ParkingSlot.setUser;
													reservation = true;
												}
							
											}
								
										}
								
									}
							}	
}


*/