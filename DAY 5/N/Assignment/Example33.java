import java.util.*;
class Example33{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String start = input.next();
		String reversed = "";
		for(int i = start.length() - 1; i >= 0; i--){
			reversed += start.charAt(i);
		}
		if(start.equals(reversed)){
			System.out.println(start +" is a Palindrome.");
		}else{
			System.out.println(start +" is NOT a Palindrome.");
		}
	}
}
