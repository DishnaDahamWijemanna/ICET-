import java.util.Scanner;
public class Me {
    static String password = "1234";
    static int attempts = 0;
    public static void displayDetails() {
		System.out.println("--- User Details ---");
        System.out.println("Name: Daham Wijemanna");
        System.out.println("Age: 22");
        System.out.println("Occupation: Software Developer");
    }
    public static void checkPassword() {
        Scanner sc = new Scanner(System.in);
        while (attempts < 3) {
            System.out.print("Enter password: ");
            String input = sc.nextLine();
            attempts++;
            if (input.equals(password)) {
                displayDetails();
                return;
            }
            if (attempts == 3) {
                System.out.println("Maximum attempts reached.");
                return;
            }
            String choice = "";
            while (!choice.equals("Yes") && !choice.equals("yes") && !choice.equals("Y") && !choice.equals("y") &&
                   !choice.equals("No") && !choice.equals("no") && !choice.equals("N") && !choice.equals("n")) {
                
                System.out.print("Do you want to continue (Yes/No)? ");
                choice = sc.nextLine();

                if (!choice.equals("Yes") && !choice.equals("yes") && !choice.equals("Y") && !choice.equals("y") &&
                    !choice.equals("No") && !choice.equals("no") && !choice.equals("N") && !choice.equals("n")) {
                    System.out.println("Invalid input. Try again.");
                }
            }
            if (choice.equals("No") || choice.equals("no") || choice.equals("N") || choice.equals("n")) {
                System.out.println("Program ended.");
                return;
            }
        }
    }
    public static void main(String[] args) {
        checkPassword();
    }
}
