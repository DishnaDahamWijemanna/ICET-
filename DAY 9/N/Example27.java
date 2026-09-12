import java.util.*;
class Example27{
    public static void sortDollarSalary(int[] dollar) {
        for (int i = 0; i < dollar.length - 1; i++) {
            for (int j = 0; j < dollar.length - 1 - i; j++) {
                if (dollar[j] > dollar[j + 1]) {
                    int temp = dollar[j];
                    dollar[j] = dollar[j + 1];
                    dollar[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] dollar = {15000, 21000, 18500, 12275, 35550, 28760, 17175, 10500};//not23, it is 25 Question
        sortDollarSalary(dollar);
        System.out.println(Arrays.toString(dollar));
    }
}
