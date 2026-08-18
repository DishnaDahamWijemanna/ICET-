import java.util.*;
class Example49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Basic Salary: ");
		double basicSalary = input.nextDouble();

		double ha = 0;
		double ta = 0;
		if(0<basicSalary){
			if( basicSalary <= 10000){
				ha = basicSalary * 0.20;
				ta = basicSalary * 0.60;
			}else if(basicSalary <= 20000){
				ha = basicSalary * 0.25;
				ta = basicSalary * 0.70;
			}else{
				ha = basicSalary * 0.30;
				ta = basicSalary * 0.75;
			}
			double grossSalary = basicSalary + ha + ta;
		    System.out.println("Gross Salary: " + grossSalary);
		}else{
			System.out.print("Invalid Salary.");
		}
		
	}
}
