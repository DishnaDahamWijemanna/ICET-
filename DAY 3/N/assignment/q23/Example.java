import java.util.Scanner;
class Example {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input weight in kilograms: ");
		double weight = input.nextDouble();
        
		System.out.print("Input height in meters: ");
		double height = input.nextDouble();
        
		double bmi = weight / (height * height);		
        
		System.out.printf("Body Mass Index is %.2f\n", bmi);
		
	}
}
