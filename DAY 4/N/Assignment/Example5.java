import java.util.*;
class Example5{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the unite price : ");
				double upri = input.nextDouble();
				
				System.out.print("Enter the Quantity : ");
				int qua  = input.nextInt();
				
				double tot = upri*qua;
				System.out.println("your price is "+tot);
				double dis;
				double nTot;
				if(tot>500){
						dis = tot*0.05;
						nTot = tot - dis;
						System.out.printf("New price with discount : %.2f \n ",nTot);
						
				}else{
						System.out.print("No discount given");
				}
		}
}
