import java.util.*;
class Example40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] clothingIDs = new int[1000];
        int count = 0;
        while (true) {
            System.out.print("Enter Clothing ID (-1 to stop): ");
            int id = input.nextInt();

            if (id == -1) {
                break;
            }
            boolean isDuplicate = false;
            for (int i = 0; i < count; i++) {
                if (clothingIDs[i] == id) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                System.out.println("Duplicate element! ID already exists.");
            } else {
                clothingIDs[count] = id;
                count++;
            }
        }
        int[] finalArray = new int[count];
        for (int i = 0; i < count; i++) {
            finalArray[i] = clothingIDs[i];
        }
        System.out.println("Selected Clothing IDs: " + Arrays.toString(finalArray));
    }
}
