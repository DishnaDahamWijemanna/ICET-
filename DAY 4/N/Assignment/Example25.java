import java.util.*;
class Example25{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the 1 integer number : ");
				int num1 = input.nextInt();
				
				System.out.print("Enter the 2 integer number : ");
				int num2 = input.nextInt();
				
				System.out.print("Enter the 3 integer number : ");
				int num3 = input.nextInt();
				
				int sub1 = (num2>num3) ? num2-num3 : num3-num2;
				int sub2 = (num1>num3) ? num1-num3 : num3-num1;
				int sub3 = (num1>num2) ? num1-num2 : num2-num1;
				
				if((num1 > sub1) || (num2 > sub2) || (num3 > sub3)){
						System.out.print("True");
				}else{
						System.out.print("False");
				}
				
		}
}
