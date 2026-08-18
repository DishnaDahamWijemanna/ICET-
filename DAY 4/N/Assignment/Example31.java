import java.util.Scanner;
class Example31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		
		if(num % 10 == 7 || num % 7 == 0) {
			System.out.println(num + " is a Buzz Number.");  /*buzz number mean if a 
			                                                 number can divide 7 without 
			                                                 remined or if we divide a number 
			                                                 in 10 its giving 7 as reminder 
			                                                 these are we call buzz numbers*/
		}else {
			System.out.println(num + " is NOT a Buzz Number.");
		}
	}
}
