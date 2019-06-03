
public class Motorcycle extends Vehicle {
	private int topSpeed;
	private int tyreSize;

	public Motorcycle(int age, String registration, String engine, String colour, int topSpeed, int tyreSize) {
		super(age, registration, engine, colour);
		this.topSpeed = topSpeed;
		this.tyreSize = tyreSize;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public int getTyreSize() {
		return tyreSize;
	}

	public void SetTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public void SetTyreSpeed(int tyreSize) {
		this.tyreSize = tyreSize;
	}

}
