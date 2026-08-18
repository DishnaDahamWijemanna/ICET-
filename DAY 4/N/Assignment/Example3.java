import java.util.*;
class Example3{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter your Chemistry marks : ");
				double chem = input.nextDouble();
				
				System.out.print("Enter your Physics marks : ");
				double phy = input.nextDouble();
				
				System.out.print("Enter your Combined maths marks : ");
				double maths = input.nextDouble();
				
				double tot = chem+phy+maths;
				double avg = tot/3;
				
				System.out.println("total is : "+ tot);
				System.out.println("avarege is : "+avg);
				
				if(avg<=75){
					System.out.print("Fail");
						
				}else{
					System.out.print("Pass");
				}
		}
}
