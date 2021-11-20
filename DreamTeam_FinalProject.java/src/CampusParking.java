import java.util.ArrayList;
import java.util.HashMap;

/*
 * Represents all parking spaces that are on campus. Used for program initialization.
 * 
 * Implements singleton design pattern: can only have one set of parking spaces.
 */
public class CampusParking {
	private static boolean exists = false;
	private static CampusParking instance;
	
	// Assuming for now that we have 5 garages with 6 floors each and 30 slots per floor.
	private static final int NUM_GARAGES = 5;
	private static final int FLOORS_PER_GARAGE = 6;
	private static final int SLOTS_PER_FLOOR = 30;
	
	//private static ParkingGarage[] garages = new ParkingGarage[NUM_GARAGES];
	private static ArrayList<ParkingGarage> garageList = new ArrayList<ParkingGarage>(); //Creating an arrayList version for use in Map class
	
	/*
	 * Can't directly create campus parking.
	 */
	private CampusParking() {
		for (int i = 1; i <= NUM_GARAGES; i++) {
			//garages[i] = new ParkingGarage(i, FLOORS_PER_GARAGE, SLOTS_PER_FLOOR);
			garageList.add(new ParkingGarage(i, FLOORS_PER_GARAGE, SLOTS_PER_FLOOR));
		}
		exists = true;
	}
	
	/*
	 * Call this function to construct all campus parking. 
	 */
	public static CampusParking createInstance() {
		if (!exists) instance = new CampusParking();
		
		return instance;
	}
	
	public static ArrayList<ParkingGarage> getGarageList() {
		return garageList;
	}
	
	
	/*Creates a boolean array of the availability of each slot in order for each floor of each garage*/	
	/* On second thought, I'm thinking we don't need this. The only line you need is garageList.get(i).getFloorList().get(j).getSlots()*/
		
//	public HashMap<String, ArrayList<ParkingSlot>> getAvailabilityList() {
//		HashMap<String, ArrayList<ParkingSlot>> garageMaps = new HashMap<String, ArrayList<ParkingSlot>>();  //Key format is "#:#" where you have GarageNumber:FloorNumber
//		int numberOSlots = garageList.get(0).getFloorList().get(0).getNumberOfSlots();
//				
//		for(int i=1; i<=garageList.size(); i++) {
//			for(int j=1; j<=garageList.get(0).getNumberOfFloors();j++) {
//				String key = i + ":" + j;
//				//boolean[] slotAvailabilityList = new boolean[numberOSlots];
//				ArrayList<ParkingSlot> floorSlots = new ArrayList<ParkingSlot>();			
//				for(int k=0; k<numberOSlots; k++) {
//					//slotAvailabilityList[k] = garageList.get(i).getFloorList().get(j).getSlots().get(k+1).getAvailability();
//					floorSlots.addAll(garageList.get(i).getFloorList().get(j).getSlots());
//				}
//				garageMaps.put(key, floorSlots);
//			}
//		}
//		return garageMaps;
//	}

	
	
	
	/*
	 * Displays textual representation of all garages, their floors, and each slot.
	 */

//	public void printAll() {
//		// Loop 1 prints garage num (no indent)
//		for (int i = 0; i < garages.length; i++) {
//			System.out.println("Garage #: " + garages[i].getGarageNumber());
//			ArrayList<GarageFloor> floors = garages[i].getFloorList();
//			
//			// Loop 2 prints floor num (indented once)
//			for (int j = 0; j < floors.size(); j++) {
//				System.out.println("\tFloor #: " + floors.get(j).getFloor());
//				ArrayList<ParkingSlot> slots = floors.get(j).getSlots();
//				
//				// Loop 3 prints slot num (indented twice)
//				for (int k = 0; k < slots.size(); k++) {
//					System.out.println("\t\tSlot #: " + slots.get(k).getSlotNumber());
//				}
//			}
//		}
//		
//	}
	
}
