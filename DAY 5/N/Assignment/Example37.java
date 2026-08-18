import java.util.Scanner;
class Example37{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first positive integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second positive integer: ");
        int num2 = input.nextInt();
        int gcd = 1;
        for(int i = 1; i <= num1 && i <= num2; i++){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("The Greatest Common Divisor (GCD) of " + num1 + " and " + num2 + " is: " + gcd);
        input.close();
    }
}
