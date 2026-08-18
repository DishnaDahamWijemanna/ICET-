import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Number of days : ");
		int days = input.nextInt();
		
		int months = days/30;
		int rDays = days%30;
		System.out.println(months+" Mounths and "+rDays+" days");
			
	}
}
