import java.util.*;
class Example{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the dividend : ");
				double num1 = input.nextDouble();
				
				System.out.print("Enter the diviser  : ");
				double num2 = input.nextDouble();
				
				int quontient = (int)num1 / (int)num2;
				double remainder = num1 % num2;
				
				System.out.println("Quontient = "+ quontient );
				System.out.printf("Remainder = %.2f\n",remainder);
				
		}
}
