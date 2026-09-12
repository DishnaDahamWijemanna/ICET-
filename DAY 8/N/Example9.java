import java.util.*;
public class Example9 {
    public static void main(String args[]){	
		int[] ar={10,20,30,40,50};
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50]
		//insert code here to add 60 as the first element 
		int[] tempAr=new int[ar.length+1];
		for (int i = 0; i < ar.length; i++){
			tempAr[i+1]=ar[i];
		}
		tempAr[0]=60;
		ar=tempAr;
		System.out.println(Arrays.toString(ar));//[60,10,20,30,40,50]

	}

}
