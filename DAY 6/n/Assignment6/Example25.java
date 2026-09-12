import java.util.*;
class Example25{
	public static double findSV(double l){
			double r = l/2.0;
			double v = (4.0/3.0)*3.14*Math.pow(r,3);
			
			return v;
			
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length(m) of the cube : ");
		double l = sc.nextDouble();
		
		double v = findSV(l);
		System.out.printf("Volume of the largest sphere: %.3f L",v);
	}
}
