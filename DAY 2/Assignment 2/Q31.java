import java.util.Scanner;
class Q31{
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			System.out.print("Combined Maths - ");
			int cMaths = input.nextInt();
			
			System.out.print("Chemistry      - ");
			int chem = input.nextInt();
			
			System.out.print("Physics        - ");
			int phy = input.nextInt();
			
			System.out.print("English        - ");
			int eng = input.nextInt();
			
			int sum = cMaths + chem + phy + eng ;
			
			System.out.println("Total          - " + sum);
			
			}
}
