import java.util.*;
class Example20{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter an any Integer number : ");
				int num = input.nextInt();
				
				if(num>0){
						System.out.print("Your number is a possitive number.");
				}else if(num==0){
						System.out.print("Your Number is a Zero.");
				}else{
						System.out.print("your number is negative number.");
				}
		}
}
