import java.util.*;
class Example39 {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				
				System.out.print("Enter time in 24-hour format (e.g. 8.30 ): ");
				double time = input.nextDouble();
				
				if(time%1<0 || time%1>=60){
					System.out.println("Invalid time entered!");	
				}else if (time >= 0.00 && time < 12.00) {
					System.out.println("Good morning");
				}else if(time >= 12.00 && time < 16.00) {
					System.out.println("Good afternoon");
				}else if(time >= 16.00 && time < 19.00) {	
					System.out.println("Good evening");
				}else {
					System.out.println("Good night");
				}
				
		}
}
