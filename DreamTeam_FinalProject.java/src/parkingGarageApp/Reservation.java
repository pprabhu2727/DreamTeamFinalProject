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
	private Users currentUser;
	private Users getReservation;
	private Users getName;
	private ParkingGarage getSlotNumber;
	private ParkingGarage getGarageNumber;
	private ParkingGarage getFloorNumber;
	private ParkingSlot getAvaSlot;
	int choice, gChoice, fChoice, sChoice;

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
							ParkingSlot.ParkingSlot(gChoice, fChoice, sChoice);	//Is there a way to change the method to work like this? and make getAvailability to check exact spot?

							if(ParkingSlot.getAvailability == true)
							{
								ParkingSlot.changeAvailability;
								ParkingSlot.setUser;
							}
				
							break;

						case 2:
							//Cancel reservation through spot location?
								String name, int floorNumber, slotNumber;
								while (input.hasNext() && !found){
							try {
								if (information.equals(name)) && (information.equals(floorNumber) && (informatiion.equals(slotNumber)))
								{
									found = true;
								}
							}
							System.out.println ("Cancelation successful")
							}catch(Exception e){

								System.out.println( "Cancelation unsuccessful");
							}

							break;

						case 3:
							//Quick Reserve. (Pseudo code that needs to be edited after the previous errors in this class are fixed)
							
							int garageNumber, floorNumber, slotNumber;
							boolean foundSlot = false;
							while(!foundSlot){
									for(int i=1; i<=garageList.size(); i++) {
										for(int j=1; j<=garageList.get(0).getNumberOfFloors();j++) {			
											for(int k=0; k<numberOSlots; k++) {
												boolean slotAvailability = garageList.get(i).getFloorList().get(j).getSlots().get(k+1).getAvailability();
												if (slotAvailability){
													slotNumber = garageList.get(i).getFloorList().get(j).getSlots().get(k+1).getSlotNumber();
													garageNumber=i;
													floorNumber=j;
													foundSlot=true;

												}
												if(foundSlot){

													break;
												}
											}
											if(foundSlot){
													break;
											}
										}
										if(foundSlot){
													break;
										}
									}
									
									//Now do the reservation with garageNumber, floorNumber, slotNumber
									
							}
						
						
						//default:
							
				
				
			}
		
		}while(choice != 4);
	}

}

/*Adapt to main? How to take in main choice into reservation class choice
  Choice M or R would work with do case system in reservation?
  Delete case statements and just make methods?*/