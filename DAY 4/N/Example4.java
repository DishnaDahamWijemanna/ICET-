import java.util.*;
class Example4{
		public static void main(String args[]){
				Scanner  input = new Scanner(System.in);
				System.out.print("Enter your Salary : ");
				double sal = input.nextDouble();
				
				int Ava_sal =50000;
				
				if(sal<=Ava_sal){
					double new_sal = sal + (sal*0.1);
					System.out.printf("for this mounth your salary will Rs%.2f"+" with your Bounes 10%%", new_sal);
					
				}else{
					double new_sal = sal + (sal*0.25);
					System.out.printf("for this mounth your salary will Rs%.2f"+", with your Bounes 25%%\n",new_sal);
				
				}
		}
}
