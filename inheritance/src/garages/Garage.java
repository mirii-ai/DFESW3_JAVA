package garages;

import java.util.ArrayList;
import java.util.Arrays;


public class Garage {
	
	public static ArrayList<Vehicle> vehicleList = new ArrayList<>();
	
	public void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
		System.out.println("====================");
		System.out.println("In the garage you have added: " + vehicle.getName());
		System.out.println("In the garage now:");
		for (int i = 0; i < vehicleList.size(); i++) {
			System.out.println(vehicleList.get(i));
		}
		System.out.println("====================");
	}
	
	public void removeVehicle(Vehicle vehicle) {
		vehicleList.remove(vehicle);
	}
	
	public void updateVehicle(int index, Vehicle input) {
		vehicleList.set(index, input);

	}
	
	public void removeAll() {
		System.out.println("You have removed all vehicles from the garage.");
		vehicleList.clear();
	}
	
	public void fixIt(Vehicle vehicle) {
		vehicle.fixVehicle();
		
	}
	
	

}
