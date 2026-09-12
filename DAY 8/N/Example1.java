import java.util.*;
class Example1{
	public static void reversePrint(int[] ar){
		System.out.print("[");
		for (int i = ar.length-1; i >=0; i--)	{
			System.out.print(ar[i]+", ");
		}
		System.out.println(ar.length==0 ? "empty]":"\b\b]");
		
	}
	public static void main(String args[]){
		int[] ar={10,20,30,40,50,60,70,80,90,100};
		reversePrint(ar);//[100,90,80,70,60,50,40,30,20,10]
	}
}
