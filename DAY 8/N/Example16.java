import java.util.*;
class Example{
	public static int[] removeDuplicates(int[] ar){
		int[] dupRemovedAr=new int[0];
		for (int i = 0; i < ar.length; i++){
			if(search(dupRemovedAr,ar[i])){
				continue;
			}
			dupRemovedAr=extendsArray(dupRemovedAr);
			dupRemovedAr[dupRemovedAr.length-1]=ar[i];
		}
		return dupRemovedAr;		
	}
	public static boolean search(int[] ar, int key){
		for (int i = 0; i < ar.length; i++){
			if(ar[i]==key){
				return true;
			}
		}
		return false;
	}
	public static int[] extendsArray(int[] ar){
		int[] tempAr=new int[ar.length+1];
		for (int i = 0; i < ar.length; i++){
			tempAr[i]=ar[i];
		}
		return tempAr;
	}
	public static void main(String args[]){	
		int[] ar={10,20,30,40,50,30,20,70,80,50};
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50,30,20,70,80,50]
		ar=removeDuplicates(ar);
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50,70,80]
		
	}
}



