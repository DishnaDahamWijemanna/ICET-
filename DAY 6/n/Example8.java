import java.util.*;
class Example8{
	public static String getReverse(int num){
			String rev = "";
			while(num>0){
				int digit=num%10;
				rev += digit;
				num/=10;
				
			}
			return rev;
				
			
		
	}
	
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt(); //12345
		String rev=getReverse(num); 
		System.out.println("Reverse of "+num+" : "+rev); //54321
	} 
}
