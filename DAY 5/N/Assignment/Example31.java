import java.util.*;
class Example31 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many classes : ");
        int no_cla = input.nextInt();
        for(int i = 1; i<=no_cla ; i++) {
            System.out.println("\n--- Class " + i + " ---");
            System.out.print("No of Students : ");
            int num = input.nextInt();
            if(num == -1) {
                System.out.println("Program terminated.");
                break;
            }
            double tot= 0;
            double max= 0;
            double min = 0;
            for(int x=1; x<=num; x++) {
                System.out.print("Enter " + x + " marks   : ");
                double marks = input.nextDouble();
                tot += marks;
                if(x == 1) {
                    max = marks;
                    min = marks;
                } else {
                    if(marks > max) {
                        max = marks;
                    }
                    if(marks < min) {
                        min = marks;
                    }
                }
            }
            double average = tot / num;
            System.out.println("\nNo of Students : " + num);
            System.out.println("Total marks    : " + (int)tot);
            System.out.println("Maximum        : " + (int)max);
            System.out.println("Minimum        : " + (int)min);
            System.out.printf("Average        : %.2f\n", average);
        }
       
    }
}
