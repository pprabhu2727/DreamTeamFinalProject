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
	
	/*Thinking about creating an array of 2d maps for each floor below*/
	public void createMaps() {
		HashMap<String, char[][]> garageMaps = new HashMap<String, char[][]>();  //Key format is "#:#" where you have GarageNumber:FloorNumber
		ArrayList<ParkingGarage> garageList = CampusParking.getGarageList();
		
		for(int i=1; i<=garageList.size(); i++) {
			for(int j=1; j<=garageList.get(0).getNumberOfFloors();j++) {
				String key = i + ":" + j;
				garageMaps.put(key, new char[j][garageList.get(0).getFloorList().get(0).getNumberOfSlots()]);
			}
		}
		//TODO: Use the ParkingSlot class to fill in the 2d char arrays for each floor. 

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



