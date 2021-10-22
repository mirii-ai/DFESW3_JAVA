package garages;

public class SuperCar extends Vehicle implements fixVehicle{
	
	private int topSpeed;
	private boolean isRaceCar;
	
	@Override
	public int fixVehicle() {
		if (isRaceCar == true) {
			return 1000* getNumberOfSeats() + topSpeed;
		}else {
			return 500* getNumberOfSeats() + topSpeed;
		}
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public boolean isRaceCar() {
		return isRaceCar;
	}

	public void setRaceCar(boolean isRaceCar) {
		this.isRaceCar = isRaceCar;
	}

	public SuperCar(int numberOfSeats, String colour, String name, int age, int topSpeed, boolean isRaceCar) {
		super(numberOfSeats, colour, name, age);
		this.topSpeed = topSpeed;
		this.isRaceCar = isRaceCar;
	}

	@Override
	public String toString() {
		return "SuperCar : "+ getName() + ", " + getColour() + ", Top Speed: " + topSpeed;
	}
	
	

}
