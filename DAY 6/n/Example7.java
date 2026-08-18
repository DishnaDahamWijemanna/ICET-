import java.util.*;
class Example7{
		public static int getSumDigit(int num){
			int sum=0;
			for(int a=num;a>0;a/=10){
					int digit = a%10;
					sum+=digit;
			}
			return sum;	
		}
	
	
	
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter an Integer value : ");
				int num = input.nextInt();
				
				
				int sum = getSumDigit(num);
				System.out.print("sum is "+sum);
		}
}
