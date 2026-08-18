import java.util.*;
class Example8{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter number to find factorial :");
				int num = input.nextInt();
				
				
				int numPlus=0;
				int fac =1;
				for(int i = num ;i>0;i--){
						fac *= i;	
				}
				System.out.print(fac);
		}
}
