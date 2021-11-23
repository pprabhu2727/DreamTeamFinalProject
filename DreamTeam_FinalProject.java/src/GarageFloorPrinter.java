import java.util.*;

public class GarageFloorPrinter {
	
	// 10 x 10 grid with 48 spaces, 2 stairs, 1 elevator.
	// Serves as a template for the structure of the map.
	private static char map[][] = { 
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
	
	
	private static void createFloorMap(int garageNum, int floorNum) {
		// Floor to be printed
		GarageFloor floor = CampusParking.getGarageList().get(garageNum).getFloorList().get(floorNum);
		
		// Modifying map template with correct availability
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (map[i][j] == 'A' || map[i][j] == 'R') {
					boolean isSlotAvailable = floor.getSlots().get(i).getAvailability();
					
					if (!isSlotAvailable) {
						map[i][j] = 'R';
					} else {
						map[i][j] = 'A';
					}
					
				}
			}
		}
	}
	
	public static void print(int garageNum, int floorNum) {
		createFloorMap(garageNum, floorNum);
		
		System.out.println("----------------------------------------");
		System.out.print("[Map of Garage " + garageNum + "]");
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
		System.out.println("----------------------------------------");
	}
	
}



