import java.util.*;
class Example23{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the integer Number 1 : ");
				int num1 = input.nextInt();
				
				System.out.print("Enter the integer Number 2 : ");
				int num2 = input.nextInt();
				
				if(num1<num2){
						System.out.print("The first number is less than the second number");
				}else if(num2<num1){
						System.out.print("The first number is greater than the second number");
						
				}else{
						System.out.print("Both are equal ");
				}
				
		}
}
