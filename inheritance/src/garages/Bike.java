package garages;

public class Bike extends Vehicle implements fixVehicle{
	
	private int topSpeed;
	private String manufacturer;
	
	@Override
	public int fixVehicle() {
		return 500* getNumberOfSeats() + topSpeed;
	}
	
	public void topSpeed() {
		System.out.println(getName() + "'s top speed is: " + topSpeed);
	}
	
	public void Manu() {
		System.out.println(getName() + "'s manufacturer is: " + manufacturer);
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Bike(int numberOfSeats, String colour, String name, int age, int topSpeed, String manufacturer) {
		super(numberOfSeats, colour, name, age);
		this.topSpeed = topSpeed;
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Bike : "+ getName() + ", " + getColour() + ", Top Speed: " + topSpeed + ", Manufacturer: " + manufacturer;
	}
	
	


}
