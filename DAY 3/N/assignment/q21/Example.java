import java.util.*;
class Example{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("How many eggs do you have: ");
		int eggs = input.nextInt();
		
		int gross = eggs / 144;
		int rGross = eggs % 144;
		int dozens = rGross / 12;
		int leftovers = rGross % 12;
		
		System.out.printf("Your number of eggs is %d gross, %d dozen, and %d\n", gross, dozens, leftovers);
	}
}
