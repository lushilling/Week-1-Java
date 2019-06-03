
public class Bird extends Animal {
	private int wingSpan;
	private String colourBeak;

	public int getwingSpan() {
		return wingSpan;
	}

	public String getcolourBeak() {
		return colourBeak;
	}

	public void SetwingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}

	public void SetcolourBeak(String colourBeak) {
		this.colourBeak = colourBeak;
	}

	public void fly() {
		System.out.println("flap flap flap");
	}

}
