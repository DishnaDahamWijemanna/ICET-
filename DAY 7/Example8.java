import java.util.*;
class Example8{
	
	public static void printData(int []ar){
		System.out.print("[");
		for(int a : ar){
			System.out.print(a+", ");
		}
		System.out.println("\b\b]");
		

		
		
	}
	public static void main(String args[]){
		int[] ar={10,20,30,40,50,60};
		printData(ar); //[10,20,30,40,50,60]
	}
}

