import java.util.*;
class Example46 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = input.nextInt();

		System.out.print("Enter second number: ");
		int b = input.nextInt();

		System.out.print("Enter third number: ");
		int c = input.nextInt();

		int a2 = a * a;
		int b2 = b * b;
		int c2 = c * c;

		if ((a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2)) {
			System.out.println("The numbers form a Pythagorean triple.");
		} else {
			System.out.println("The numbers DO NOT form a Pythagorean triple.");
		}
	}
}
