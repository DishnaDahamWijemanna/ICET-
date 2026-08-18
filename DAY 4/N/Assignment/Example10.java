import java.util.*;
class Example10{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter a integer number : ");
				int num = input.nextInt();
				
				if(num%2==0){
						System.out.print("your number is an even number");
				}else{
						System.out.print("your number is an odd number");
				}
		}
}
