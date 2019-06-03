
public class Runner {
	public static void main(String[] args) {

		Book b1 = new Book("Alice in Wonderland", 200, "Lewis Carroll");

		System.out.println("The book name is " + b1.getName());

		Person p1 = new Person("Tom", 001, "tom@mail.com");

		System.out.println(p1.getEmail());
	}
}
