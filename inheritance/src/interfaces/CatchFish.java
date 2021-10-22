package interfaces;

public interface CatchFish {
	//The only data this class can contain are abstract methods
	//because ALL methods MUST be abstract, no need to call them abstract
	
	public void catchFish() ;
	
	public void eatFish();
	
	//Any class that uses this interface MUST use these two methods
	}
}
