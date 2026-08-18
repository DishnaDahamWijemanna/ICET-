import java.util.*;
class Example28{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter your weigh : ");
				double w = input.nextDouble();
				
				System.out.print("Enter your age : ");
				int a = input.nextInt();
				
				if(w>=50 && a>18){
						System.out.print("you can donate your blood");
				}else{
						System.out.print("you can't donate your blood");
				}
				
		}
}
