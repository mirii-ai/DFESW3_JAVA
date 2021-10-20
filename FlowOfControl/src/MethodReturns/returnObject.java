package MethodReturns;

public class returnObject {
	//makes an animal
	int age;
	String breed;
	String colour;
	float length;
	
	public returnObject() {
		
	}
	
	public returnObject(int age, String breed, String colour, float length) {
		this.age = age;
		this.breed = breed;
		this.colour = colour;
		this.length = length;
	}

	@Override
	public String toString() {
		return "returnObject [age=" + age + ", breed=" + breed + ", colour=" + colour + ", length=" + length + "]";
	}

	
}
