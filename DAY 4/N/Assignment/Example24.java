import java.util.*;
class Example24{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter 1 integer number : ");
				int num1 = input.nextInt();
				
				System.out.print("Enter 2 integer number : ");
				int num2 = input.nextInt();
				
				System.out.print("Enter 3 integer number : ");
				int num3 = input.nextInt();
				
				int lastDig1 = num1%10;
				int lastDig2 = num2%10;
				int lastDig3 = num3%10;
				
				boolean result = (lastDig1==lastDig2) || (lastDig2==lastDig3) || (lastDig1==lastDig3);
					System.out.print("The result is : " +result);
		}
}
