import java.util.*;
public class Example35{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = input.nextDouble();
        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();
        double result = 1.0;
        int exp;
		if (exponent < 0) {
			exp = -exponent; 
		} else {
			exp = exponent;  
		}

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        if (exponent < 0) {
            result = 1.0 / result;
        }
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        input.close();
    }
}
