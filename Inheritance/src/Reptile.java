
public class Reptile extends Animal {
	private int tailLength;
	private String skinTexture;

	public int gettailLength() {
		return tailLength;
	}

	public String skinTexture() {
		return skinTexture;
	}

	public void SettailLength(int tailLength) {
		this.tailLength = tailLength;
	}

	public void SetskinTexture(String skinTexture) {
		this.skinTexture = skinTexture;
	}
}
