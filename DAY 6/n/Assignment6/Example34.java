import java.util.*;
class Example34 {
    public static long facto(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static long calGroups(int n, int r) {
        if (r > n || n < 0 || r < 0) {
            return 0;
        }
        long nFactorial = facto(n);
        long rFactorial = facto(r);
        long nMinusRFactorial = facto(n - r);

        return nFactorial / (nMinusRFactorial * rFactorial);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of children - ");
        int n = input.nextInt();

        System.out.print("Number of group members - ");
        int r = input.nextInt();

        long result = calGroups(n, r);
        System.out.println("The number of groups = " + result);
    }
}
