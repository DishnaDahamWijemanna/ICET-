import java.util.Scanner;
class Q32{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Red value : ");
		int red = input.nextInt();
		
		System.out.print("Enter Green value : ");
		int green = input.nextInt();
		
		System.out.print("Enter Blur value : ");
		int blue = input.nextInt();
		
		int redInv = 255 - red;
		int greenInv = 255 - green;
		int blueInv = 255 - blue;
		
	
		System.out.println("Inversion of given colour - " +"["+redInv+","+greenInv+","+blueInv+"]");
		
	}
}
