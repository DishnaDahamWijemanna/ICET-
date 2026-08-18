import java.util.*;
class Example12{
		public static void getPAndA(double an,double r){
				double area = 3.14 * r * r;
				double perimeter = 2 * 3.14 * r;
				System.out.printf("area - %.2f\n",area);
				System.out.printf("perimeter - %.2f",perimeter);
		}
		
		public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the angle : ");
				double an = sc.nextDouble();
				
				System.out.print("Enter the radius : ");
				double r = sc.nextDouble();
			
				getPAndA(an,r);
		}
	
}
