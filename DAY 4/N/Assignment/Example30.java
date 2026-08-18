import java.util.*;
class Example30 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
		if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is lowercase.");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("The character is uppercase.");
		} else {
			System.out.println("It is not an English letter.");
		}
	}
}
