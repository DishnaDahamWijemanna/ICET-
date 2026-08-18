import java.util.Scanner;
class Example55{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num = input.nextInt();

		System.out.print("Enter lower bound: ");
		int lower = input.nextInt();

		System.out.print("Enter upper bound: ");
		int upper = input.nextInt();

		if (num >= lower && num <= upper) {
			System.out.println("The number is within the range.");
		} else {
			System.out.println("The number is NOT within the range.");
		}
	}
}
