import java.util.*;
class Example7{
		public static void main(String args[]){
				Scanner input =new Scanner(System.in);
				System.out.print("Enter your first integer number : ");
				int num1 = input.nextInt();
				
				System.out.print("Enter your Second integer number : ");
				int num2 = input.nextInt();
				
				System.out.print("Enter your Third integer number : ");
				int num3 = input.nextInt();
				
				int maxNum =0;
				
				if (num1>maxNum){
						maxNum = num1;
				}
				if(num2>maxNum){
						maxNum = num2;
				}
				if(num3>maxNum){
						maxNum = num3;
				}
				
				System.out.print("Max number is "+ maxNum);
				
		}
}
