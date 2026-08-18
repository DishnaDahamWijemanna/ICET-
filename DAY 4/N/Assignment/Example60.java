import java.util.Scanner;

public class Example60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter parcel weight (in kg): ");
        double weight = input.nextDouble();

        double charge;

        if (weight <= 5) {
            charge = 500;
        } else {
            double eWeight = weight - 5;
            charge = 500 + (eWeight * 100);
        }

        System.out.println("Courier Charge = Rs. " + charge);

        input.close();
    }
}
