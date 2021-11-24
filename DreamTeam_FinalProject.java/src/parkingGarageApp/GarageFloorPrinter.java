package parkingGarageApp;
import java.util.*;

public class GarageFloorPrinter {
	
	// 12 x 12 grid with 48 spaces, 2 stairs, 1 elevator.
	// the sides display row and column numbers for spaces
	// Serves as a template for the structure of the map.
	private static char map[][] = { 
			{ ' ', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' },
			{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
			{ '0', ' ', '@', '*', 'A', 'A', 'A', 'A', 'A', 'A', '*', 'E' },
			{ '1', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
			{ '2', ' ', 'A', '*', 'A', 'A', 'A', 'A', 'A', 'A', '*', 'A' },
			{ '3', ' ', 'A', '*', 'A', 'A', 'A', 'A', 'A', 'A', '*', 'A' },
			{ '4', ' ', 'A', '*', '*', '*', '*', '*', '*', '*', '*', 'A' },
			{ '5', ' ', 'A', '*', '*', '*', '*', '*', '*', '*', '*', 'A' },
			{ '6', ' ', 'A', '*', 'A', 'A', 'A', 'A', 'A', 'A', '*', 'A' },
			{ '7', ' ', 'A', '*', 'A', 'A', 'A', 'A', 'A', 'A', '*', 'A' },
			{ '8', ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*' },
			{ '9', ' ', '*', '*', 'A', 'A', 'A', 'A', 'A', 'A', '*', '@' },
			};
	
	
	private static int createFloorMap(int garageNum, int floorNum) {
		int numSlotsAvailable = 0;
		
		// Floor to be printed
		GarageFloor floor = CampusParking.getGarageList().get(garageNum).getFloorList().get(floorNum);
		
		// Modifying map template with correct availability
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				if (map[i][j] == 'A' || map[i][j] == 'R') {
					boolean isSlotAvailable = floor.getSlots().get(i).getAvailability();
					
					if (!isSlotAvailable) {
						map[i][j] = 'R';
					} else {
						map[i][j] = 'A';
						numSlotsAvailable++;
					}
					
				}
			}
		}
		return numSlotsAvailable;
	}
	
	public static void print(int garageNum, int floorNum) {
		// Garage and floor start at index 0 internally
		int numAvailable = createFloorMap(garageNum - 1, floorNum - 1);
		
		System.out.println("----------------------------------------");
		System.out.print("[Garage " + garageNum + ", Floor " + floorNum +"]");
		System.out.println("  [Available Spaces: " + numAvailable + "]\n");
		
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				System.out.print(map[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("\n[Key]");
		System.out.println("[A = Available Slot]");
		System.out.println("[R = Reserved Slot]");
		//System.out.println("[H = Handicapped Slot]");
		//System.out.println("[S = Staff-Only Slot]");
		System.out.println("[@ = Stairs]");
		System.out.println("[E = Elevators]");
		System.out.println("----------------------------------------");
	}
	
}



