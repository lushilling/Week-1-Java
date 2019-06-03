import java.util.ArrayList;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
//		exercise1();
//		calculator(2, 4, "+");
//		checkString("Hello Lucy", "Hello Tom");
//		printNumbers1();
//		printNumbers2();
//		printNumbers3();
		printNumbers4();
		printNumbers5();
//		collections1();
//		collections2();
		stream();

	}

	public static void exercise1() {
		String e1 = "Hello World!";
		System.out.println(e1);
	}

	public static void calculator(int number1, int number2, String operator) {
		if (operator.equals("+")) {
			System.out.println(number1 + number2);
		} else if (operator.equals("-")) {
			System.out.println(number1 - number2);
		} else if (operator.equals("*")) {
			System.out.println(number1 * number2);
		} else if (operator.equals("/")) {
			System.out.println(number1 / number2);
		} else
			System.out.println("Operator not accepted");
	}

	public static void checkString(String s1, String s2) {
		if (s1.equals(s2))
			System.out.println("Strings match");
		else
			System.out.println("Strings don't match");
	}

	public static void printNumbers1() {
		int i;
		for (i = 0; i <= 10; i++)
			System.out.println(i);
	}

	public static void printNumbers2() {
		int i;
		for (i = 100; i <= 999; i++) {
			System.out.println(i);
		}
	}

	public static void printNumbers3() {
		int i;
		for (i = 1; i <= 10; i++) {
			if (i == 1)
				System.out.println("One");
			else if (i == 2)
				System.out.println("Two");
			else if (i == 3)
				System.out.println("Three");
			else if (i == 4)
				System.out.println("Four");
			else if (i == 5)
				System.out.println("Five");
			else if (i == 6)
				System.out.println("Six");
			else if (i == 7)
				System.out.println("Seven");
			else if (i == 8)
				System.out.println("Eight");
			else if (i == 9)
				System.out.println("Nine");
			else
				System.out.println("Ten");
		}

	}

	public static void printNumbers4() {

	}

	public static void printNumbers5() {

	}

	public static void collections1() {
		int[] arrayCollections = new int[101];
		for (int i = 1; i < arrayCollections.length; i++) {
			System.out.println(i);
		}

	}

	public static void collections2() {
		ArrayList<Integer> listCollections = new ArrayList<Integer>();
		for (int i = 100; i <= 999; i++) {
			listCollections.add(i);
		}
		System.out.println(listCollections);

		for (int number : listCollections) {
			System.out.println(number * 10);
		}

	}

	public static void stream() {
		ArrayList<Integer> listCollections = new ArrayList<Integer>();
		for (int i = 100; i <= 999; i++) {
			listCollections.add(i);
		}
		System.out.println(listCollections.stream().map(i -> i * 10).collect(Collectors.toList()));
	}
}
