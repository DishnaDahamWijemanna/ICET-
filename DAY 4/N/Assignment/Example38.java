import java.util.*;
class Example38{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter your attendance percentage : ");
				double aPer = input.nextDouble();
				
				System.out.print("Enter your Final test marks : ");
				double fMarks = input.nextDouble();
				
				
				if (aPer > 80 && fMarks > 50) {
					System.out.println("Eligible to sit for the O/L examination.");
				} else {
					System.out.println("Not eligible to sit for the O/L examination.");
				}
				
				
		}
}
