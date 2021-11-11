
public class ParkingSlot{
	private boolean isAvailable;
	private int slotNumber;
	
	
	public ParkingSlot(int slotNumber) {
		this.slotNumber=slotNumber;
		this.isAvailable=true;
	}
	
	public boolean getAvailability() {
		return this.isAvailable;
	}
	
	public int getSlotNumber() {
		return this.slotNumber;
	}
	
	public void changeAvailability() {
		this.isAvailable = !this.isAvailable;
	}
}