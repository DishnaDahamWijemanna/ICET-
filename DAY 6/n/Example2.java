import java.util.*;
class Example2{
	
		public static void printDigirCount(){
		    Scanner input = new Scanner(System.in);
			System.out.print("Enter Number : ");
			int num = input.nextInt();
			
			int count=0;
			do{
				count++;
				num/=10;
			}while(num!=0);
			System.out.println("No of digits : "+count);

		}
		public static void main(String args[]){
			printDigirCount();
		}
}
