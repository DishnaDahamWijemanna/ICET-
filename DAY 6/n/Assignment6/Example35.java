class Example35 {
    public static long findSM() {
        long number = 1;
        while (true) {
            boolean isDivisible = true;
            for (int i = 1; i <= 20; i++) {
                if (number % i != 0) {
                    isDivisible = false;
                    break;
                }
            }
            if (isDivisible) {
                return number;
            } 
            number++;
        }
    }
    public static void main(String[] args) {
        long result = findSM();
        System.out.println("Smallest  positive divisible by all of the number between 1 and 20: " + result);
    }
}
