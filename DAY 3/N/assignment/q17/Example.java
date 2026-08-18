import java.util.*;
class Example {
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the total amount of purchase : ");
		double tot = input.nextDouble();
		
		double tax = tot*0.15;
		
		System.out.printf("Your import tax : %.2f\n",tax);
	}
}
