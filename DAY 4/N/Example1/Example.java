import java.util.*;
class Example{
		public static void main(String args[]){
				Scanner  input = new Scanner(System.in);
				System.out.print("Enter your Salary : ");
				double sal = input.nextDouble();
				
				int Ava_sal =50000;
				
				if(sal<=Ava_sal){
					double new_sal = sal + 10000;
					System.out.println("for this mounth your salary will "+ new_sal+" with your Bounes");
					
				}else{
					
					System.out.printf("Your salary is Rs%.2f"+",no bounes available for aboue 50000 salary\n",sal);
				
				}
		}
}
