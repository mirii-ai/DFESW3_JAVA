package garages;

public class Vehicle implements fixVehicle{
	
	private int numberOfSeats;
	private String colour;
	private String name;
	private int age;

	@Override
	public int fixVehicle() {
		return 500 * numberOfSeats;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Vehicle(int numberOfSeats, String colour, String name, int age) {
		super();
		this.numberOfSeats = numberOfSeats;
		this.colour = colour;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Vehicle : " + name + ", " + colour;
	}

//	@Override
//	public String toString() {
//		return "Vehicle name: " + name;
//	}
	
	
	

}
