import java.util.*;
class Example36 {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				
				System.out.print("Enter an alphabet letter: ");
				char ch = input.next().toUpperCase().charAt(0);
				
				if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
						System.out.println(ch + " is a Vowel.");
				}else if(ch >= 'A' && ch <= 'Z') {
						System.out.println(ch + " is a Consonant.");
				} else {
						System.out.println("Invalid input! Please enter an alphabet letter.");
				}
		}
		
}
