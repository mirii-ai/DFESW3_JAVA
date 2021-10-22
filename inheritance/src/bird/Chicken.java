package bird;

import interfaces.Flight;
import interfaces.LayEgg;

//To give interfaces to classes we use implements
//this chicken class uses things from the parent Bird class
//but also has its own methods from LayEgg and Flight
//Each class has to define its own methods and working BUT MUST CONTAIN the base methds from layeff and flight


public class Chicken extends Bird implements LayEgg, Flight {
	//USING INTERFACES
	
	@Override
	public void laysEgg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eggHatches() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void flies() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swoop() {
		// TODO Auto-generated method stub
		
	}
	
	//Now the Chicken class has all the methods from LayEgg and Flight interfaces
	

}
