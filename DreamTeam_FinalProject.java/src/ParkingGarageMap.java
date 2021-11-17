import java.util.*;

public class ParkingGarageMap {
	
	// just a basic map that prints to console
	// doesn't interact with any other classes yet
	
	// 10 x 10 grid with 48 spaces, 2 stairs, 1 elevator
	char map[][] = { 
			{ '@', '*', 'A', 'A', 'A', 'A', 'A', 'A', '*', 'E' },
			{ '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
			{ 'A', '*', 'A', 'A', 'A', 'A', 'A', 'A', '*', 'A' },
			{ 'A', '*', 'A', 'A', 'A', 'A', 'A', 'A', '*', 'A' },
			{ 'A', '*', '*', '*', '*', '*', '*', '*', '*', 'A' },
			{ 'A', '*', '*', '*', '*', '*', '*', '*', '*', 'A' },
			{ 'A', '*', 'A', 'A', 'A', 'A', 'A', 'A', '*', 'A' },
			{ 'A', '*', 'A', 'A', 'A', 'A', 'A', 'A', '*', 'A' },
			{ '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
			{ '*', '*', 'A', 'A', 'A', 'A', 'A', 'A', '*', '@' },
			};
	
	/*Creates a boolean array of the availability of each slot in order for each floor of each garage*/
	public void createMaps() {
		HashMap<String, boolean[]> garageMaps = new HashMap<String, boolean[]>();  //Key format is "#:#" where you have GarageNumber:FloorNumber
		ArrayList<ParkingGarage> garageList = CampusParking.getGarageList();
		int numberOSlots = garageList.get(0).getFloorList().get(0).getNumberOfSlots();
		
		
		for(int i=1; i<=garageList.size(); i++) {
			for(int j=1; j<=garageList.get(0).getNumberOfFloors();j++) {
				String key = i + ":" + j;
				boolean[] slotAvailabilityList = new boolean[numberOSlots];
				for(int k=0; k<numberOSlots; k++) {
					slotAvailabilityList[k] = garageList.get(i).getFloorList().get(j).getSlots().get(k+1).getAvailability();
				}
				garageMaps.put(key, slotAvailabilityList);
			}
		}
	}
	
	
	
	public void print() {
		
		System.out.print("[Map of Garage " + "A" + "]");
		System.out.println("  [Available Spaces: " + "48" + "]\n");
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(map[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("\n[Key]");
		System.out.println("[A = Available Slot]");
		System.out.println("[R = Reserved Slot]");
		System.out.println("[H = Handicapped Slot]");
		System.out.println("[S = Staff-Only Slot]");
		System.out.println("[@ = Stairs]");
		System.out.println("[E = Elevators]");
	}
	
	public void updateMap() {
		
	}
	
}



