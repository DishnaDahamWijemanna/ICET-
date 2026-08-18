import java.util.*;
class Example4{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the unit price : ");
				double upri = input.nextDouble();
				
				System.out.print("Enter the Quantity that you bought : ");
				int qua = input.nextInt();
				
				double tot = upri*qua;
				System.out.println("Total price : "+ tot);
				
				if (tot>1500){
						System.out.print("You are entitled to the super draw");
				}else{
						System.out.print("try again");
				}
				
		}
}
