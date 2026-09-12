import java.util.*;
class Example3{
	public static int indexOf(int data, int[] ar){
		int index=-1;
		for (int i = 0; i < ar.length; i++){
			if(ar[i]==data){
				index=i;
				break;
			}
		}
		return index;
	}
	public static void main(String args[]){
		int[] ar={60,20,50,100,90,70,30,100,80,10};
		int index;
		index=indexOf(100,ar); //first index of
		System.out.println("Index of 100 : "+index); //3
		
		index=indexOf(99,ar);
		System.out.println("Index of 99  : "+index); //-1
	}
}
