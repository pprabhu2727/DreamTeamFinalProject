package parkingGarageApp;

public class Admin extends Users{
	String AccessCode;
	public Admin (String name, String Email, String Address, String Username, String Password, String PhoneNumber,String AccessCode){
		super(name, Email, Address, Username, Password, PhoneNumber);
		this.AccessCode = AccessCode;

	}
	@Override
	public String toString(){
		return "User Info: \n Name: " + getName() + "\n Email " + getEmail() + "\n Address " + getAddress() + "\n Phone " + getPhone() + "\n Access Code:" + getCode(); 
	}
	public String getCode(){
		return AccessCode;

	}
	public void setCode(String AccessCode){
		this.AccessCode = AccessCode;
	}
}