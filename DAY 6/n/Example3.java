import java.util.*;
class Example3{
	public static void printTotal(int a, int b){
		//----------Process-------------------
		int total;
		total=a+b;
		
		//----------Output--------------------
		System.out.println(a+" + "+b+" = "+total);
	}
	public static void main(String[] args){
		//----------Input---------------------
		Scanner input=new Scanner(System.in);
		System.out.print("Input number 1 : ");
		int num1=input.nextInt();
		System.out.print("Input number 2 : ");
		int num2=input.nextInt();
		
		printTotal(num1,num2); //method calling statement
	} 
}

