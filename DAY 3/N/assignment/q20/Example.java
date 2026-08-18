import java.util.*;
class Example{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Input Second : ");
		int sec = input.nextInt();
		
		int hours = sec/(60*60);
		int min  = (sec%(60*60))/60;
		int fSec = sec%60;
		
		System.out.println(hours+":"+min+":"+fSec);
		
	}
}
