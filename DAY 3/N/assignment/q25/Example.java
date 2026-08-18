import java.util.Scanner;
class Example {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the tax-inclusive price in dollars: ");
		double inclusivePrice = input.nextDouble();
		
		double actualPrice = inclusivePrice / 1.10;
		double salesTax = inclusivePrice - actualPrice;
		
		System.out.printf("Actual Price is: $%.2f\n", actualPrice);
		System.out.printf("Sales Tax is: $%.2f\n", salesTax);
		
	}
}
