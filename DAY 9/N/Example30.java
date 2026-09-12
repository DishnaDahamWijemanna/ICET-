import java.util.*;
class Example30 {
    public static void printData(String[] months, double[] reserves) {
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i] + " : " + reserves[i]);
        }
    }
    public static void sortDescending(String[] months, double[] reserves) {
        for (int i = 0; i < reserves.length - 1; i++) {
            for (int j = 0; j < reserves.length - 1 - i; j++) {
                if (reserves[j] < reserves[j + 1]) {
                    double tempReserve = reserves[j];
                    reserves[j] = reserves[j + 1];
                    reserves[j + 1] = tempReserve;
                    String tempMonth = months[j];
                    months[j] = months[j + 1];
                    months[j + 1] = tempMonth;
                }
            }
        }
    }
    public static void main(String[] args) {
        String[] originalMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", 
									"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double[] originalReserves = {2361.0, 2311.0, 1916.0, 1812.0, 1920.0,
									1859.0, 1818.0, 1716.0, 1776.0, 1703.0, 1805.0, 1896.0};
        String[] monthsCopy = new String[originalMonths.length];
        double[] reservesCopy = new double[originalReserves.length];

        for (int i = 0; i < originalMonths.length; i++) {
            monthsCopy[i] = originalMonths[i];
            reservesCopy[i] = originalReserves[i];
        }
        System.out.println("");
        printData(originalMonths, originalReserves);
        sortDescending(monthsCopy, reservesCopy);
        System.out.println("\n Reserves");
        printData(monthsCopy, reservesCopy);
    }
}
