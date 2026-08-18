import java.util.*;
class Example29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many bottles of beer are on the wall: ");
        int tBottles = input.nextInt();
        System.out.println();
        for (int i = tBottles; i >= 1; i--) {
            if (i > 1) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
            } else {
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
            }

            if (i - 1 > 1) {
                System.out.println("Take one down, pass it around, " + (i - 1) + " bottles of beer on the wall.");
            } else if (i - 1 == 1) {
                System.out.println("Take one down, pass it around, 1 bottle of beer on the wall.");
            } else {
                System.out.println("Take one down, pass it around, no more bottles of beer on the wall.");
            }

            System.out.println();
        }
    }
}
