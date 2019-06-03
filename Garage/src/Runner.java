public class Runner {

	public static void main(String[] args) {

		Car v1 = new Car(5, "R35 5ZG", "Internal Combsution", "blue", 5, "Audi");
		Motorcycle v2 = new Motorcycle(10, "MF48 6KV", "Internal Combsution", "red", 100, 20);
		Boat v3 = new Boat(15, "KB84 6LD", "Electrical", "yellow", 90, 100);
		Car v4 = new Car(14, "MHG64 U54G", "Electric", "red", 4, "Ford");
		Car v5 = new Car(1, "DG6J N756G", "Internal Combustion", "yellow", 4, "Ford");

		Garage g1 = new Garage();
		g1.vehicleList.add(v1);
		g1.vehicleList.add(v2);
		g1.vehicleList.add(v3);
		g1.vehicleList.add(v4);
		g1.vehicleList.add(v5);

		// print the engine type for first engine in the vehicle list
		System.out.println(g1.vehicleList.get(0).getEngine());

		// print every vehicle in the vehicle list
		for (Vehicle num : g1.vehicleList) {
			String s = "";
			s = s + num.getAge() + ", " + num.getColour() + ", " + num.getEngine();
			System.out.println(s);
		}

		// print the bill price for every item in the garage list
		System.out.println(g1.billprice());
	}
}
