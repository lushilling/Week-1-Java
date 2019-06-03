
public class Boat extends Vehicle {
	private int length;
	private int maxLoadWeight;

	public Boat(int age, String registration, String engine, String colour, int length, int maxLoadWeight) {
		super(age, registration, engine, colour);
		this.length = length;
		this.maxLoadWeight = maxLoadWeight;
	}

	public int getLength() {
		return length;
	}

	public int getMaxLoadWeight() {
		return maxLoadWeight;
	}

	public void SetLength(int length) {
		this.length = length;
	}

	public void SetMaxLoadLength(int maxLoadWeight) {
		this.maxLoadWeight = maxLoadWeight;
	}

}
