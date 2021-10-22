package garages;

public class runner {
	
	public static void main(String[] args) {
		
//		private int numberOfSeats;
//		private String colour;
//		private String name;
//		private int age;
//		
		
//		private int propellerSpeed; 
//		private boolean isMilitary;
//		
//		private int topSpeed;
//		private String manufacturer;
//		
//		private int topSpeed;
//		private boolean isRaceCar;
		
		Garage g1 = new Garage(); //you have to make a new garage object as well
		
		
		Vehicle heli1 = new Helicopter(3, "green", "Apache", 3, 120, true);
		Vehicle heli2 = new Helicopter(5, "black", "Shinook", 6, 135, true);
		
		Vehicle car1 = new Vehicle(5, "red", "Vauxhall Corsa", 5);
		Vehicle tank1 = new Vehicle(4, "camo", "FURY", 75);
		Vehicle s1 = new SuperCar(1, "silver", "SpeedDemon", 1, 280, true);
		Vehicle s2 = new SuperCar(2, "red", "Ferrari", 1, 205, false);
		Vehicle s3 = new SuperCar(2, "green", "Lambourghini", 2, 205, false);
		
		Vehicle b1 = new Bike(2, "black", "Kawasaki z1300", 17, 230, "Kawasaki");
		Vehicle b2 = new Bike(2, "lime green", "Hayabusa", 5, 240, "Kawasaki");
		
		g1.addVehicle(b1); //this adds b1 to the arraylist in g1
		
		g1.addVehicle(b2);
		g1.addVehicle(heli1);
		g1.addVehicle(s1);
		
		g1.removeAll();
		
		g1.addVehicle(s2);
		
		
		
		
		
		
	}

}
