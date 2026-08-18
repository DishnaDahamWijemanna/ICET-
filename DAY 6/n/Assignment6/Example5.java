import java.util.*;
class Example5{
		public static void leapY(){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the year : ");
				int year = input.nextInt();
				
				if((year %4 == 0 && year % 100!=0) || (year%400==0)){
					System.out.print(year +" is a leap year");
				}else{
					System.out.print(year +" is not a leap year");
				}
				
		}
		
		public static void main(String args[]){
				leapY();
		}
}
