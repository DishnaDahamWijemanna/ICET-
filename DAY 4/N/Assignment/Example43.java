import java.util.Scanner;
class Example43{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number  : ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number : ");
        double num2 = input.nextDouble();

        System.out.print("Enter the operator (+,-,*,/,%,^): ");
        char operator = input.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+':result = num1 + num2;
                break;
            case '-':result = num1 - num2;
                break;
            case '*':result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
					System.out.println("Error: Cannot divide by zero!");
                    validOperation = false;
                }
                break;
            case '%':result = num1 % num2;
                break;
            case '^':result = Math.pow(num1, num2); 
                break;
            default:System.out.println("Invalid operator!");
                validOperation = false;
        }
        System.out.println(num1+" "+operator+" "+num2+" = "+result);
    }
}
