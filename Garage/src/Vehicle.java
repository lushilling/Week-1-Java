
public abstract class Vehicle {
	private int age;
	private String registration;
	private String engine;
	private String colour;

	public Vehicle(int age, String registration, String engine, String colour) {
		this.age = age;
		this.registration = registration;
		this.engine = engine;
		this.colour = colour;
	}

	public int getAge() {
		return age;
	}

	public String getRegistration() {
		return registration;
	}

	public String getEngine() {
		return engine + " engine";
	}

	public String getColour() {
		return colour;
	}

	public void SetAge(int age) {
		this.age = age;
	}

	public void SetRegistration(String registration) {
		this.registration = registration;
	}

	public void SetEngine(String engine) {
		this.engine = engine;
	}

	public void SetColour(String colour) {
		this.colour = colour;
	}

}
