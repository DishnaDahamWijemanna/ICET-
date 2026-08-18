import java.util.Scanner;
class Q30{
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a number : ");
			int num = input.nextInt();
			
			String strConcat = ""+ num + num + num;
			System.out.println(strConcat);
			
			int aricAdd = num+num+num;
			System.out.print(aricAdd);
		}
}

