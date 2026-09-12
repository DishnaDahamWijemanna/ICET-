import java.util.*;
class Example31 {
    public static void printList(String[] names, int[] marks) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + marks[i]);
        }
    }
    public static void main(String[] args) {
        String[] names = {"Sachini", "Tharusha", "Shehan", "Ashini", "Sachin", "Kasun", 
							"Lihini", "Hashini", "Ashini", "Kaveesha"};
        int[] marks = {807, 796, 728, 801, 818, 746, 781, 756, 801, 812};
        printList(names, marks);
        String[] tempNames = new String[names.length + 1];
        int[] tempMarks = new int[marks.length + 1];
        for (int i = 0; i < names.length; i++) {
            tempNames[i] = names[i];
            tempMarks[i] = marks[i];
        }
        tempNames[names.length] = "Amesh";
        tempMarks[marks.length] = 804;

        System.out.println();
        printList(tempNames, tempMarks);
        int removeIndex = -1;
        for (int i = 0; i < tempNames.length; i++) {
            for (int j = i + 1; j < tempNames.length; j++) {
                if (tempNames[i].equals(tempNames[j])) {
                    removeIndex = j;
                    break;
                }
            }
        }
        String[] uniqueNames = new String[tempNames.length - 1];
        int[] uniqueMarks = new int[tempMarks.length - 1];
        for (int i = 0, k = 0; i < tempNames.length; i++) {
            if (i == removeIndex) continue;
            uniqueNames[k] = tempNames[i];
            uniqueMarks[k] = tempMarks[i];
            k++;
        }
        System.out.println();
        printList(uniqueNames, uniqueMarks);
        for (int i = 0; i < uniqueMarks.length - 1; i++) {
            for (int j = 0; j < uniqueMarks.length - 1 - i; j++) {
                if (uniqueMarks[j] < uniqueMarks[j + 1]) {
                    int tm = uniqueMarks[j];
                    uniqueMarks[j] = uniqueMarks[j + 1];
                    uniqueMarks[j + 1] = tm;

                    String tn = uniqueNames[j];
                    uniqueNames[j] = uniqueNames[j + 1];
                    uniqueNames[j + 1] = tn;
                }
            }
        }
        System.out.println();
        printList(uniqueNames, uniqueMarks);
    }
}
