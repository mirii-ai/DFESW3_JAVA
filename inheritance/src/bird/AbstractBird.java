package bird;

//we need to specify it's an abstract class
//public abstract class <class name>
public abstract class AbstractBird {

	//Abstract classes don't have fields
	//Abstract classes shouldn't be something you can create
	//It just tells other classes to do something

	public abstract void noise(); //this doesn't have any method. We have specified that we want it to exist.
	//Pelican, which extends from abstractBird, has to have/ must implement the abstractBird.noise method
	
	//regular method
	public void sleep() {
		System.out.println("zzz zzz zzz");
	}
	
	

}
