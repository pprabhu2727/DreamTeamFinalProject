package parkingGarageApp;

public class ParkingSlot{
	private boolean isAvailable;
	private int slotNumber;
	private Users currentUser;
	
	
	public ParkingSlot(int slotNumber) {
		this.slotNumber=slotNumber;
		this.isAvailable=true;
		this.currentUser=null;
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
	
	public void setUser(Users user) {
		this.currentUser = user;
	}
	
	public void clearUser() {
		this.currentUser=null;
	}
	
	public Users getUser() {
		return this.currentUser;
	}
}