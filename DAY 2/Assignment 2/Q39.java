import java.util.Scanner;
class Q39{
		public static void main(String args[]){
			System.out.println("----Subject total calculator----");
			System.out.println();
			Scanner input = new Scanner(System.in);
			System.out.print("Subject 1 name - ");
			String sub1 = input.nextLine();
			
			System.out.print(sub1+" marks - ");
			int s1M = input.nextInt();
			input.nextLine();
			
			System.out.print("Subject 2 name - ");
			String sub2 = input.nextLine();
			
			System.out.print(sub2+" marks - ");
			int s2M = input.nextInt();
			input.nextLine();
			
			System.out.print("Subject 3 name - ");
			String sub3 = input.nextLine();
			
			System.out.print(sub3+" marks - ");
			int s3M = input.nextInt();
			input.nextLine();
			
			System.out.printf("%-10s"+"               %15d\n",sub1,s1M);
			System.out.printf("%-10s"+"               %15d\n",sub2,s2M);
			System.out.printf("%-10s"+"               %15d\n",sub3,s3M);
			
				
		}
}
