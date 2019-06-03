
public class Animal {
	private String name;
	private int age;
	private int weight;
	private String colour;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getWeight() {
		return weight;
	}

	public String getColour() {
		return colour;
	}

	public void SetName(String name) {
		this.name = name;
	}

	public void SetAge(int age) {
		this.age = age;
	}

	public void SetWeight(int weight) {
		this.weight = weight;
	}

	public void SetColour(String colour) {
		this.colour = colour;
	}

	public void consume() {
		System.out.println("munch munch");
	}

}
