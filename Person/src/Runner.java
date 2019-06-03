// 		Person Exercise

//	1.	Create a Person class that models the following:
//		a.	Name
//		b.	Age
//		c.	Job Title
//	2.	Create a method to return all three of these in a formatted string. 
//		HINT: Override the ToString() method.
//	3.	Create some example objects with this class.
//	4.	Create a List Implementation and store those object inside.
//	5.	Use a stream to output all of your people to the console.
//	6.	Create a method that can search for a specific Person by their name.

public class Runner {

	public static void main(String[] args) {

		Person p1 = new Person("Lucy", 23, "Engineer");
		Person p2 = new Person("Tom", 19, "Driver");
		Person p3 = new Person("Bob", 70, "Retired");
		Person p4 = new Person("Ted", 34, "Manager");
		Person p5 = new Person("Leah", 13, "Banker");
		Person p6 = new Person("Claire", 40, "Sales Assistant");

		PersonList plist = new PersonList();
		plist.personList.add(p1);
		plist.personList.add(p2);
		plist.personList.add(p3);
		plist.personList.add(p4);
		plist.personList.add(p5);
		plist.personList.add(p6);

		p1.aboutPerson();

		// plist.personList.stream().forEachOrdered(System.out.println(plist.personList));

		for (Person p : plist.personList) {
			System.out.println(p.getName());
		}

		plist.personList.forEach(System.out::println);

	}
}
