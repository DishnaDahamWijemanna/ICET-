import java.util.*;

class Example6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Salary : ");
        double sal = input.nextDouble();

        double wat = 0;

        if (sal > 150000) {
            wat += Math.min(sal - 150000, 50000) * 0.06;
        }
        if (sal > 200000) {
            wat += Math.min(sal - 200000, 50000) * 0.12;
        }
        if (sal > 250000) {
            wat += Math.min(sal - 250000, 50000) * 0.18;
        }
        if (sal > 300000) {
            wat += Math.min(sal - 300000, 50000) * 0.24;
        }
        if (sal > 350000) {
            wat += Math.min(sal - 350000, 50000) * 0.30;
        }
        if (sal > 400000) {
            wat += (sal - 400000) * 0.36;
        }

        double net = sal - wat;
        System.out.println("your Net salary is : " + net + " with tax.");

        input.close();
    }
}

