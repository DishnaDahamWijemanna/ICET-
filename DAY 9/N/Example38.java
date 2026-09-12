import java.util.*;
class Example38 {
    public static boolean hasSameDigits(int n1, int n2) {
        char[] a1 = Integer.toString(n1).toCharArray();
        char[] a2 = Integer.toString(n2).toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
    public static void main(String[] args) {
        int x = 1;
        while (true) {
            if (hasSameDigits(x, 2 * x) &&
                hasSameDigits(x, 3 * x) &&
                hasSameDigits(x, 4 * x) &&
                hasSameDigits(x, 5 * x) &&
                hasSameDigits(x, 6 * x)) {
                System.out.println("Smallest positive integer x: " + x);
                break;
            }
            x++;
        }
    }
}
