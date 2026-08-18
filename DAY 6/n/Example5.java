import java.util.*;
class Example5{
	public static int getTotal(int a, int b){
		//----------Process-------------------
		int total;
		total=a+b;
		return(total);
	}
	public static void main(String[] args){
		//----------Input---------------------
		Scanner input=new Scanner(System.in);
		System.out.print("Input number 1 : ");
		int num1=input.nextInt();
		System.out.print("Input number 2 : ");
		int num2=input.nextInt();
		
		
		int tot;
		tot = getTotal(num1,num2); //method calling statement
		
		//----------Output--------------------
		System.out.println(num1+" + "+num2+" = "+tot);
	} 
}

