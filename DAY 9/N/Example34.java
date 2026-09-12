import java.util.*;
class Example34 {
    public static void printList(String[] countries, double[] times) {
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i] + " - " + times[i] + "s");
        }
    }
    public static void main(String[] args) {
        String[] countries = {
            "Switzerland(2)", "Ivory Coast(1)", "Jamaica(2)", "United States(1)", 
            "United States(2)", "Great Britain", "Ivory Coast(2)", "Jamaica(3)", 
            "Switzerland(1)", "Jamaica(1)"
        };
        double[] times = {11.11, 10.86, 10.76, 10.98, 11.11, 11.05, 11.14, 10.61, 11.06, 10.74};
        int minIndex = 0;
        for (int i = 1; i < times.length; i++) {
            if (times[i] < times[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("Gold Medal Winner 2021: " + countries[minIndex] + " - " + times[minIndex] + "s");
        int secondIndex = -1;
        for (int i = 0; i < times.length; i++) {
            if (i == minIndex) continue;
            if (secondIndex == -1 || times[i] < times[secondIndex]) {
                secondIndex = i;
            }
        }
        System.out.println("\nNew Gold Medal Winner 2022: " + countries[secondIndex] + " - " + times[secondIndex] + "s");
        String[] newCountries = new String[countries.length - 1];
        double[] newTimes = new double[times.length - 1];

        for (int i = 0, k = 0; i < countries.length; i++) {
            if (i == minIndex) continue;
            newCountries[k] = countries[i];
            newTimes[k] = times[i];
            k++;
        }
        for (int i = 0; i < newTimes.length - 1; i++) {
            for (int j = 0; j < newTimes.length - 1 - i; j++) {
                if (newTimes[j] > newTimes[j + 1]) {
                    double tempTime = newTimes[j];
                    newTimes[j] = newTimes[j + 1];
                    newTimes[j + 1] = tempTime;

                    String tempCountry = newCountries[j];
                    newCountries[j] = newCountries[j + 1];
                    newCountries[j + 1] = tempCountry;
                }
            }
        }

        System.out.println();
        printList(newCountries, newTimes);
    }
}
