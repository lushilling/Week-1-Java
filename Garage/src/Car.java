
public class Car extends Vehicle {
	private int numberOfDoors;
	private String manufacturer;

	public Car(int age, String registration, String engine, String colour, int numberOfDoors, String manufacturer) {
		super(age, registration, engine, colour);
		this.numberOfDoors = numberOfDoors;
		this.manufacturer = manufacturer;
	}

	public int getnumberOfDoors() {
		return numberOfDoors;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void SetNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public void SetManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

}
