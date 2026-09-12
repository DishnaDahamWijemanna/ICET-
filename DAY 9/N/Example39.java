import java.util.*;
class Example39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ids = new int[100];
        String[] names = new String[100];
        int count = 0;
        while (true) {
            System.out.print("Enter Admission Number: ");
            int id = input.nextInt();
            boolean exists = false;
            for (int i = 0; i < count; i++) {
                if (ids[i] == id) {
                    exists = true;
                    break;
                }
            }
            if (exists) {
                System.out.println("Duplicate Admission number...");
                System.out.print("Do you want to enter another admission number? (y/n): ");
                char choice = input.next().charAt(0);
                if (choice == 'n' || choice == 'N') {
                    break;
                }
            } else {
                input.nextLine();
                System.out.print("Enter Student Name: ");
                String name = input.nextLine();
                ids[count] = id;
                names[count] = name;
                count++;
                System.out.print("Do you want to add another student? (y/n): ");
                char choice = input.next().charAt(0);
                if (choice == 'n' || choice == 'N') {
                    break;
                }
            }
        }
    }
}
