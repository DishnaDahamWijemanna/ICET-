import java.util.*;
class Example49{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int ori_num = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10; 
            sum += (digit * digit * digit); 
            num /= 10; 
        }
        if (sum == ori_num) {
            System.out.println(ori_num + " is an Armstrong number.");
        } else {
            System.out.println(ori_num + " is not an Armstrong number.");
        }
    }
}
