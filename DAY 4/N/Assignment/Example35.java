import java.util.*;
class Example35{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter today temperature : ");
				double temp = input.nextDouble();
				
				if(temp>=80){
						System.out.print("The appropriate activity is Swimming");
				}else if(80>temp && temp>=60){
					    System.out.print("The appropriate activity is Tennis");
				}else if(60>temp && temp>=40){
						System.out.print("The appropriate activity is Golf");
				}else{
						System.out.print("The appropriate activity is Skiing");
				}
				
		}
}
