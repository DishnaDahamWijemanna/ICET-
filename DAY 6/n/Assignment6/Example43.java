import java.util.*;
class Example43 {
    public static String convertToBinary(int val) {
        String bin = "";
        while (val > 0) {
            int rem = val % 2;
            bin = rem + bin;
            val = val / 2;
        }
        if (bin.equals("")) {
            bin = "0";
        }
        return bin;
    }
    public static String convertToOctal(int val) {
        String octa = "";
        while (val > 0) {
            int rem = val % 8;
            octa = rem + octa;
            val = val / 8;
        }
        if (octa.equals("")) {
            octa = "0";
        }
        return octa;
    }
    public static String convertToHexadecimal(int val) {
        String hexa = "";
        while (val > 0) {
            int rem = val % 16;
            
            if (rem == 10) {
                hexa = "A" + hexa;
            } else if (rem == 11) {
                hexa = "B" + hexa;
            } else if (rem == 12) {
                hexa = "C" + hexa;
            } else if (rem == 13) {
                hexa = "D" + hexa;
            } else if (rem == 14) {
                hexa = "E" + hexa;
            } else if (rem == 15) {
                hexa = "F" + hexa;
            } else {
                hexa = rem + hexa;
            }
            
            val = val / 16;
        }
        if (hexa.equals("")) {
            hexa = "0";
        }
        return hexa;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = scan.nextInt();

        System.out.println("Binary: " + convertToBinary(num));
        System.out.println("Octal: " + convertToOctal(num));
        System.out.println("Hexadecimal: " + convertToHexadecimal(num));
    }
}
