import java.util.*;
class Example15{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter any integer number : ");
				int number = input.nextInt();
				
				int sum = 0;
				
				for(int num = number;num>0;num /= 10){
						int figer = num%10;
						sum+=figer;
				}		
				System.out.println("Sum of digits: " + sum);
		}
}
