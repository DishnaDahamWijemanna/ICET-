import java.util.*;
class Example37{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter current annual salary: ");
				double cSalary = input.nextDouble();
				
				System.out.print("Enter performance rating (1 =excellent, 2 =good, 3 =poor): ");
				int rating = input.nextInt();
				
				double rRate = 0; //raiseRate
				
				if (rating == 1) {
					rRate = 0.06;
				} else if (rating == 2) {
					rRate = 0.04;
				} else if (rating == 3) {
					rRate = 0.015;		
				} else {	
					System.out.println("Invalid rating entered!");
					
				}	
					
				double rAmount = cSalary * rRate;
				double newSalary = cSalary + rAmount;
				System.out.printf("New Salary     : %.2f\n", newSalary);
		}
}

