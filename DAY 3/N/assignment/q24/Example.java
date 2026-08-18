import java.util.Scanner;
class Example{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter basic salary: ");
		double basicSalary = input.nextDouble();
		
		double employeeFund = basicSalary * 0.120;
		double employerFund = basicSalary * 0.035;
		double pensionFund  = basicSalary * 0.083;
		
		System.out.printf("Employee Fund : %.2f\n", employeeFund);
		System.out.printf("Employer Fund : %.2f\n", employerFund);
		System.out.printf("Pension Fund  : %.2f\n", pensionFund);
        
	}
}
