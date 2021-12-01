package parkingGarageApp;

public class GarageFloorPrinter {
	
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
	
	private static int createFloorMap(int garageNum, int floorNum) {
		int numSlotsAvailable = 0;
		
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
		
		// Replace 'A' on map with the appropriate slot number
		int k = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (map[i][j] == 'A') {
					System.out.print(CampusParking.getGarageList().get(garageNum).getFloorList().get(floorNum).getSlots().get(k).getSlotNumber() + " ");
					if (k < 9) {
						System.out.print(" ");
					}
					k++;
				}
				else {
					System.out.print(map[i][j] + "  ");
					if (map[i][j] == 'R') {
						k++;
					}
				}
			}
			System.out.println();
		}
		
		System.out.println("\n[Key]");
		System.out.println("[R = Reserved Slot]");
		System.out.println("[@ = Stairs]");
		System.out.println("[E = Elevators]");
		System.out.println("----------------------------------------");
	}
	
}



