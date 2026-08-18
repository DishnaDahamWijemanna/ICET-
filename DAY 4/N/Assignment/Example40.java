import java.util.*;
class Example40{
		public static void main (String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter a Year : ");
				int year = input.nextInt();
				input.nextLine();
				
				System.out.print("Enter a month : ");
				String month = input.nextLine().toLowerCase();
				
				int days = 0;
				
				boolean leapYear = false;
				if ((year %4 ==0 && year % 100 != 0) || (year % 400 ==100)){
						leapYear = true;
						System.out.println("This is a leap year");
				}else{
					    System.out.println("This is not a leap year");
				}
				
				
				if(month.equals("january") || month.equals("march") || month.equals("may") || month.equals("july") || 
					month.equals("august") || month.equals("october") || month.equals("december")  ){
						
						days = 31;
				
				}else if(month.equals("april") || month.equals("june") || month.equals("september") || month.equals("november")){
						days = 30;
				}else if(month.equals("february")){
						if(leapYear){
							days = 29;	
						}else {
							days = 28;
						}	
				}else{
					System.out.println("Invalid month name entered!");
						
				}
				
				System.out.println("In "+year+" "+month +" has "+days+" days.");
				
				
		}
}
