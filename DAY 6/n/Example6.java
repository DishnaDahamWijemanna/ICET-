import java.util.*;
class Example6{
	public static int getDigitsCount(int num){
		//----------Process-------------------
		int count=0;
		do{
			count++;
			num/=10;
		}while(num!=0);
		return count;
	  }
	public static void main(String[] args){
		//----------Input---------------------
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
				
		int count =getDigitsCount(num); //method calling statement
		
		//----------Output--------------------
		System.out.println("No of digits : "+count);
		
	}
	 
}

