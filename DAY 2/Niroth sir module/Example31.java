import java.util.Scanner;
class Example31{
	public static void main(String aegs[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your number 1: ");
		int x=input.nextInt();
		System.out.print("Enter your nauber 2: ");
		int y=input.nextInt();
		input.close();
		int z=x+y;
		System.out.print("Total is "+x+" "+"+"+" "+y+"="+z);
	}
}