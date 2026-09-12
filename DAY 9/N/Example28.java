import java.util.*;
class Example28 {
    public static int[] modifyArray(int[] arr, int index, int value) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        if (index >= 0 && index < newArr.length) {
            newArr[index] = value;
        }
        return newArr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Array1 = {10, 20, 30, 40};
        System.out.println(Arrays.toString(Array1));
        System.out.print("Enter replace index: ");
        int index = input.nextInt();
        System.out.print("Enter replace value: ");
        int value = input.nextInt();
        int[] modifiedArray = modifyArray(Array1, index, value);
        System.out.println("Previous array -> " + Arrays.toString(Array1));
        System.out.println("New array -> " + Arrays.toString(modifiedArray));
    }
}
