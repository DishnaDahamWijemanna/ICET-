import java.util.*;
class Example33{
		public static void main (String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Is the  permanent employee? (yes/no): ");
				String pEmp = input.next().toLowerCase();
				
				if (pEmp.equals("yes")) {
					System.out.print("Enter base salary: ");
					double salary = input.nextDouble();
					
					
					System.out.print("Enter years of service: ");
					double yearSer = input.nextDouble();
					
					
					double bPercentage = 0;
					if (yearSer < 5) {
						bPercentage = 0.10; 
					} else if (yearSer <= 10) { 
						bPercentage = 0.15; 
					} else {
						bPercentage = 0.25; 
					}
					
					double bonusAmount = salary * bPercentage;
					double totalSalary = salary + bonusAmount;
					
					System.out.println("Base Salary: "+ salary);
					System.out.println("Bonus: "+ bonusAmount);
					System.out.println("totalSalary "+ totalSalary);
				}else{
					    System.out.print("Enter base salary: ");
					    double salary = input.nextDouble();
						System.out.println("Base Salary: "+ salary);
				}
				
		}
}
