
public class ParkingGarageMap {
	
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



