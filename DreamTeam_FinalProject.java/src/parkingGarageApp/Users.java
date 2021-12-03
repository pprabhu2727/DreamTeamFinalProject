package parkingGarageApp;




public class Users{
	
	private String name;
	private String Email;
	private String Address;
	private String Username;
	private String Password;
	private String PhoneNumber;
	private Vehicle vehicle;
	private Reservation reservation;
	
	public Users(String name, String Email, String Address, String Username, String Password, String PhoneNumber) {
		this.name = name;
		this.Email = Email;
		this.Address = Address;
		this.Username = Username;
		this.Password = Password;
		this.PhoneNumber = PhoneNumber;
	
	}
	
	public Users(String name, String Email, String Address, String Username, String Password, String PhoneNumber,Vehicle vehicle ) {
		this.name = name;
		this.Email = Email;
		this.Address = Address;
		this.Username = Username;
		this.Password = Password;
		this.PhoneNumber = PhoneNumber;
		this.vehicle = vehicle;
	}
	public Users(String name, String Email, String Address, String Username, String Password, String PhoneNumber,Vehicle vehicle, Reservation reservation ) {
		this.name = name;
		this.Email = Email;
		this.Address = Address;
		this.Username = Username;
		this.Password = Password;
		this.PhoneNumber = PhoneNumber;
		this.vehicle = vehicle;
		this.reservation = reservation;
	}


	public Users() {
		
	}
	//Getters and Setters
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;	
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getEmail() {
		return this.Email;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public String getAddress() {
		return this.Address;
	}
	public void setUsername(String Username) {
		this.Username = Username;
	}
	public String getUsername() {
		return this.Username;
	}
	public void setPhone(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
	public String getPhone() {
		return this.PhoneNumber;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
	public String getPassword() {
		return this.Password;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public String toString(){
		return "User Info:"+"\n Username: " + getUsername() + "\n Password: " + getPassword() + "\n Name: " + getName() +  "\n Email: " + getEmail() + "\n Address: " + getAddress() + "\n Phone:" + getPhone() + "\n Vehicle Info: " + getVehicle() + "\n"; 
	}
	
}




