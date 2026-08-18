import java.util.*;
class Example27{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter integer number1 : ");
				double num1 = input.nextInt();
				
				System.out.print("Enter integer number2 : ");
				double num2 = input.nextInt();
				
				System.out.print("Enter integer number3 : ");
				double num3 = input.nextInt();
				
				if(num1>num2 && num2>num3){
						System.out.print("Decreasing");
				}else if(num3>num2 && num2>num1){
						System.out.print("Increasing");
				}else{
						System.out.print("Neither increasing nor decreasing order");
				}
				
		}
}
