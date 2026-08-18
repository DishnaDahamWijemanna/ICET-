import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the byte value : ");
		long b_val = input.nextLong();//byte value can be more long thats why I put the long
		
		double kb = b_val/1024;
		double mb = b_val/(1024*1024);
		double gb = b_val/(1024*1024*1024);
		
		System.out.printf("KB value of your byte value : %.2f\n", kb);
		System.out.printf("MB value of your byte value : %.2f\n", mb);
		System.out.printf("GB value of your byte value : %.2f\n", gb);
	}
}
