import java.util.*;
class Example26{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the selling price of the product : ");
				double sprice = input.nextDouble();
				
				System.out.print("Enter the cost of the product : ");
				double cprice = input.nextDouble();
				
				if(sprice>cprice){
						System.out.print("Profit");
				}else if(cprice>sprice){
						System.out.print("Loss");
				}else{
						System.out.print("No Profit No Loss");
				}	
		}
}
