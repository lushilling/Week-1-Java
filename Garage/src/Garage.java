import java.util.ArrayList;

public class Garage {
	public ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public String billprice() {

		for (Vehicle v : vehicleList) {
			if (v instanceof Car) {
				System.out.println("The price is £" + (5 * ((Car) v).getnumberOfDoors()) + "for a car");
			} else if (v instanceof Motorcycle) {
				System.out.println("The price is £" + (10 * ((Motorcycle) v).getTopSpeed()) + "for a motorcycle");
			} else if (v instanceof Boat) {
				System.out.println("The price is £" + (15 * ((Boat) v).getLength()));
			}
		}
		return "";
	}
}