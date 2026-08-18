import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius : ");
		double radi = input.nextDouble();
		
		double area = 3.14*radi*radi;
		double perim = 2*3.14*radi;
		
		System.out.println("area of a circle : "+area );
		System.out.println("perimeter of a circle : "+perim);
	}
}
