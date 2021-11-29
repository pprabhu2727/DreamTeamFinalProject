package parkingGarageApp;

public class Permit {

	private String permit;
	private boolean b;
	
	public Permit(String permit){
		this.permit = permit;
	}
	
	public void setPermit(String permit){
		this.permit = permit;
	}
	
	public String getPermit(){
		return this.permit;
	}
	
	public boolean checkPermit(){
		if(permit == null)
			b = false;
		else
			b = true;
		
		return b;
	}
}
