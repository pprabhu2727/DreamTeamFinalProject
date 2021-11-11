import java.util.ArrayList;

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
	
	private ParkingGarage[] garages = new ParkingGarage[NUM_GARAGES];
	
	/*
	 * Can't directly create campus parking.
	 */
	private CampusParking() {
		for (int i = 0; i < NUM_GARAGES; i++) {
			garages[i] = new ParkingGarage(i, FLOORS_PER_GARAGE, SLOTS_PER_FLOOR);
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
	
	/*
	 * Displays textual representation of all garages, their floors, and each slot.
	 */
	public void printAll() {
		// Loop 1 prints garage num (no indent)
		for (int i = 0; i < garages.length; i++) {
			System.out.println("Garage #: " + garages[i].getGarageNumber());
			ArrayList<GarageFloor> floors = garages[i].getFloorList();
			
			// Loop 2 prints floor num (indented once)
			for (int j = 0; j < floors.size(); j++) {
				System.out.println("\tFloor #: " + floors.get(j).getFloor());
				ArrayList<ParkingSlot> slots = floors.get(j).getSlots();
				
				// Loop 3 prints slot num (indented twice)
				for (int k = 0; k < slots.size(); k++) {
					System.out.println("\t\tSlot #: " + slots.get(k).getSlotNumber());
				}
			}
		}
		
	}
	
}
