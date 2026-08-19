import java.util.*;
class Example11{
		public static void celconverter(double c){
				double f = (c*9/5)+32;
				double k = c+ 273.15;
				
				System.out.println("fahrenheit - "+f);
				System.out.print("Celsius - "+k);
				
		}
		public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter celsios value : ");
				double c = sc.nextDouble();
				
				celconverter(c);
		}
}
