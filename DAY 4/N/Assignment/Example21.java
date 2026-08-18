import java.util.*;
class Example21{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the integer number1 : ");
				int num1 = input.nextInt();
				
				System.out.print("Enter the integer number2 : ");
				int num2 = input.nextInt();
				int absD;
				if(num1>num2){
						absD = num1-num2;
						
				}else{
						absD = num2-num1;
				}
				System.out.print("Absolute difference is :" +absD);
		}
}
