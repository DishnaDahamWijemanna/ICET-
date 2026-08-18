import java.util.*;
class Example11{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				double totalH=0;
				double totalW=0;
				for(int i =1;i<=100;i++){
						System.out.println("Student "+i);
						System.out.print("Enter Student "+i+" Height : ");
						double height =input.nextDouble();
						
						System.out.print("Enter Student "+i+" Weight : ");
						double weight =input.nextDouble();
						System.out.println();
						totalH += height;
						totalW += weight;
						
						
				}
				double avgH = totalH/100;
				double avgW = totalW/100;
				System.out.println("Average height is " +avgH);
				System.out.println("Average Weight is " +avgW);
				
		}
}

