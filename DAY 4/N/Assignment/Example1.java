import java.util.*;
class Example1{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter first int number : "); //i mention here to input int value to avoid input double values 
				int num1 = input.nextInt();
				
				System.out.print("Enter second int number : ");//i mention here to input int value to avoid input double values
				int num2 = input.nextInt();
				int add ;
				if(num1>num2){
						add = num1+num2;
						System.out.print("Sum of your two numers : "+add);
				}else{
						System.out.println("number1 : "+num1);
						System.out.println("number2 : "+num2);
				}
				
		}
}
