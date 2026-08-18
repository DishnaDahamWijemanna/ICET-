import java.util.*;
public class Example57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Date (month): ");
        int m1 = input.nextInt();
        System.out.print("Enter First Date (day): ");
        int d1 = input.nextInt();
        System.out.print("Enter First Date (year): ");
        int y1 = input.nextInt();

        System.out.println();

        System.out.print("Enter Second Date (month): ");
        int m2 = input.nextInt();
        System.out.print("Enter Second Date (day): ");
        int d2 = input.nextInt();
        System.out.print("Enter Second Date (year): ");
        int y2 = input.nextInt();
        
        System.out.println();

        if(m1 < 1 || m1 > 12 || d1 < 1 || d1 > 31 || y1 <= 0 ||
            m2 < 1 || m2 > 12 || d2 < 1 || d2 > 31 || y2 <= 0){
            System.out.println("Invalid Date!");
        }else if (y1 < y2 || (y1 == y2 && m1 < m2) || (y1 == y2 && m1 == m2 && d1 < d2)){
            System.out.println("First date comes first.");
        }else if (y1 > y2 || (y1 == y2 && m1 > m2) || (y1 == y2 && m1 == m2 && d1 > d2)){
            System.out.println("Second date comes first.");
        }else{
            System.out.println("Both dates are the same.");
        }
    }
}
