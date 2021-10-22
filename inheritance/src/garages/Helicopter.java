package garages;

public class Helicopter extends Vehicle implements fixVehicle{
	

	private int propellerSpeed; 
	private boolean isMilitary;
	
	@Override
	public int fixVehicle() {
		return 500* getNumberOfSeats() + propellerSpeed;
	}

	public int getPropellerSpeed() {
		return propellerSpeed;
	}

	public void setPropellerSpeed(int propellerSpeed) {
		this.propellerSpeed = propellerSpeed;
	}

	public boolean isMilitary() {
		return isMilitary;
	}

	public void setMilitary(boolean isMilitary) {
		this.isMilitary = isMilitary;
	}

	public Helicopter(int numberOfSeats, String colour, String name, int age, int propellerSpeed, boolean isMilitary) {
		super(numberOfSeats, colour, name, age);
		this.propellerSpeed = propellerSpeed;
		this.isMilitary = isMilitary;
	}
	
}
