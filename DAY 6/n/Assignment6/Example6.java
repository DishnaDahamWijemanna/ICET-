import java.util.*;
class Example6{
		public static void calIn(){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the num 1 : ");
				int num1 = input.nextInt();
				
				System.out.print("Enter the num 2 : ");
				int num2 = input.nextInt();
				
				if(num1>num2){
						System.out.print("--> "+num1+" > "+num2);
				}else if(num2>num1){
						System.out.print("--> "+num2+" > "+num1);
				}else{
						System.out.print("--> "+num2+" = "+num1);
				}
				
		}
		public static void main(String args[]){
				calIn();
		}
}
