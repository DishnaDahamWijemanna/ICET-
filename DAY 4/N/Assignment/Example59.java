import java.util.Scanner;
class Example59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter R (0-255): ");
        double r = input.nextDouble();

        System.out.print("Enter G (0-255): ");
        double g = input.nextDouble();

        System.out.print("Enter B (0-255): ");
        double b = input.nextDouble();

        double c, m, y, k;

        if(r == 0 && g == 0 && b == 0){
            c = 0.0;
            m = 0.0;
            y = 0.0;
            k = 1.0;
        }else{
            double rPrime = r / 255.0;
            double gPrime = g / 255.0;
            double bPrime = b / 255.0;
            double w = Math.max(rPrime, Math.max(gPrime, bPrime));
            c = (w - rPrime) / w;
            m = (w - gPrime) / w;
            y = (w - bPrime) / w;
            k = 1.0 - w;
        }
        System.out.println("Cyan (C)    = " + c);
        System.out.println("Magenta (M) = " + m);
        System.out.println("Yellow (Y)  = " + y);
        System.out.println("Black (K)   = " + k);
    }
}
