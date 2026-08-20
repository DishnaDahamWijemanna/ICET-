import java.util.*;
class Example24{
		public static double findVol(double r, double h){
				double v = 3.14*r*r*h*1000;
				return v;
		}
		public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the radius(m) of cylinder : ");
				double r = sc.nextDouble();
				
				System.out.print("Enter the height(m) of cylinder : ");
				double h = sc.nextDouble();
				
				double v = findVol(r,h);
				System.out.printf("volume of the cylinder : %.3f L", v);
		}
}
