import java.util.*;
class Example7{
	public static void main(String args[]){
		int[] ar={100,200,300};
		System.out.print(ar[0]+" "+ar[1]+" "+ar[2]);
		for(int a : ar){
			a++;
		}
		System.out.print(ar[0]+" "+ar[1]+" "+ar[2]);
		
		for(int i=0; i<ar.length; i++){
			ar[i]++;
		}
		System.out.print(ar[0]+" "+ar[1]+" "+ar[2]);
	}
}

