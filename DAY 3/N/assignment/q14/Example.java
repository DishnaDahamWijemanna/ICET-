import java.util.*;
class Example{
		public static void main(String args[]){
				Scanner input =new Scanner(System.in);
				System.out.print("Enter first number : ");
				double num1 = input.nextDouble();
				
				System.out.print("enter second number : ");
				double num2 = input.nextDouble();
				
				double add = num1 + num2;
				double multi = num1*num2;
				double sub = num1-num2;
				double divi = num1/num2;
				double rem = num1 % num2;
				
				System.out.printf("Addition of your two nubers - %.2f\n",add);
				System.out.printf("Multiplication of your two nubers - %.2f\n",multi);
				System.out.printf("Subtraction of your two nubers - %.2f\n",sub);
				System.out.printf("Division of your two nubers - %.2f\n",divi);
				System.out.printf("Remainder of your two nubers - %.2f\n",rem);
		}
}
