import java.util.*;
class Example{
	public static void printDigitsCount(){
		//----------Input---------------------
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		
		//----------Process-------------------
		int count=0;
		do{
			count++;
			num/=10;
		}while(num!=0);
		
		//----------Output--------------------
		System.out.println("No of digits : "+count);
	}
	public static void main(String[] args){
		printDigitsCount(); //method calling statement
	} 
}

