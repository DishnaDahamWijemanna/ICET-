import java.util.*;
class Example6{
		public static void main(String args[]){
				Scanner input =new Scanner(System.in);
				System.out.print("Enter a Year : ");
				int year = input.nextInt();
				
				boolean isLeapYear = false;
				
				if ((year %4 ==0 && year % 100 != 0) || (year % 400 ==100)){
						isLeapYear = true;
				}
				
				if(isLeapYear){
						System.out.println(year + " is a leaap Year.");
						
				}else{
						System.out.println(year +" is not aleap Year.");
				}
		}
}
