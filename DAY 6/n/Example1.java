import java.util.*;
class Example1{
		public static void printTotal(){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter Number 1 : ");
			int num1 = input.nextInt();
			
			System.out.print("Enter Number 2 : ");
			int num2 = input.nextInt();
			
			
			int tot;
			tot =num1+num2;
			System.out.print(num1+" + "+num2+" = "+tot);
			
		}
		public static void main(String args[]){
		printTotal();	
		}
}
