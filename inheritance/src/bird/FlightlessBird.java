package bird;

public class FlightlessBird extends bird{
	
	private String habitat;
	private int landSpeed;
	
	public void attemptToFly() {
		System.out.println("Ultimately fails.");
	}
	
	@Override //Good practice to let developers know you are overwriting something
	public void makeNoise() {
		System.out.println("*Stomping feet*");
	}

	//getters and setters
	
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getLandSpeed() {
		return landSpeed;
	}

	public void setLandSpeed(int landSpeed) {
		this.landSpeed = landSpeed;
	}

	public FlightlessBird(String featherColour, int wingSpan, boolean migratory, String habitat, int landSpeed) {
		super(featherColour, wingSpan, migratory);
		this.habitat = habitat;
		this.landSpeed = landSpeed;
	}
	
	
}
