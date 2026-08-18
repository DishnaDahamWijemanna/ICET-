import java.util.*;
class Example9{
		public static void getNum(double num){
				System.out.printf("%.2f",num);
		}
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter a decimal number : ");
				double num = input.nextDouble();
				
				getNum(num);
				
				
		}
}
