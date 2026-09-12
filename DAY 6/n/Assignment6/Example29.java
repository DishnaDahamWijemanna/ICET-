import java.util.*;
class Example29 {
    public static int getMDay(String x) {
        switch (x.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                return 31;

            case "april":
            case "june":
            case "september":
            case "november":
                return 30;

            case "february":
                return 28;

            default:
                System.out.println("Month name incorrect !");
                return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Month Name : ");
        String month = input.nextLine();
        int days = getMDay(month);
        if (days != 0) {
            System.out.println("Number of days : " + days);
        }
        input.close();
    }
}

