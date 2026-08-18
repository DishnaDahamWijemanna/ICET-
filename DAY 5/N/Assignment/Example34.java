import java.util.*;
class Example34{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter a character to search: ");
        char targetChar = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {
                count++;
            }
        }
        System.out.println("The character '" + targetChar + "' appears " + count + " time(s).");
    }
}
