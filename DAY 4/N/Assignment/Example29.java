import java.util.*;
class Example29{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter an integer number 1 : ");
				int num1 = input.nextInt();
				
				System.out.print("Enter an integer number 2 : ");
				int num2 = input.nextInt();
				
				if ((num1>0 && num2>0) || (num1<0 && num2<0)){
						System.out.print("True");
				}else{
						System.out.print("False");
				}
		}
}
