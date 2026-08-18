import java.util.Scanner;
class Q29{
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the 1 st number : ");
			int firstNum = input.nextInt();
			
			System.out.print("Enter the 2 nd number : ");
			int secondNum = input.nextInt();
			
			input.close();
			
			int sum = firstNum + secondNum;
			System.out.print(firstNum+" "+"+"+" "+secondNum+" "+"="+" "+sum);	
		}
}
