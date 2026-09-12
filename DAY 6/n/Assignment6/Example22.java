import java.util.*;
class Example22{
		public static double msConverter(double km){
				double ms = ((km *1000)/3600);
				return ms;
				
		}
		public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the Kilor Meteers per hour : ");
				double km  = sc.nextDouble();
				
				
				double ms = msConverter(km);
				System.out.printf("speed in ms : %.2f ms^-1",ms);
		}
}
