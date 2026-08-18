import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the price of the product : ");
		double price = input.nextDouble();
		
		System.out.print("Enter the discount rate(%) of the product : ");
		double dis_rate = input.nextDouble();
		
		double discount = price *(dis_rate/100);
		
		System.out.printf("Your discount price : %.2f\n",discount);
	}
}
