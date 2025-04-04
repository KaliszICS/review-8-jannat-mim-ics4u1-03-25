import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
	}
	public static void q1() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Insert a word: ");
		String word = scanner.nextLine();
		
		String pluralWord = pluralize(word);
		System.out.println("Plural form: " + pluralWord);
		}

		public static String pluralize(String word) {
			if (word.endsWith("ife")) {
				return word.substring(0, word.length() - 3) + "ives";

			} else if (word.endsWith("ey")) {
				return word + "s";

			} else if (word.endsWith("y")) {
				return word.substring(0, word.length() - 1) + "ies";

			} else {
				return word + "s";
			}
		}

	public static void q2() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Insert an integer: ");
		int num1 = scanner.nextInt();

		System.out.print("Insert another integer: ");
		int num2 = scanner.nextInt();

		System.out.print("Insert one more integer: ");
		int num3 = scanner.nextInt();

		int min = min(num1, num2, num3);
		System.out.println("The smallest number is " + min);

	}

	public static int min (int a, int b, int c) {
		return Math.min(a, Math.min(b,c));
		}

	public static void q3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insert a year: ");
		int year = scanner.nextInt();

		boolean result = isLeapYear(year);
		System.out.println(result);
		scanner.close();
	}

	public static Boolean isLeapYear(int year) {
		return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
	}

}
