import java.util.*;
public class Example8 {

    public static void main(String args[]){	


		int[] ar={10,20,30,40,50};
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50]
		int [] tempAr = new int[ar.length+1];
        for(int i = 0;i<ar.length;i++){
            tempAr[i] =  ar[i];
        }
        ar = tempAr;
        ar[ar.length-1]= 60;
		//
		//
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50,60]
	}

}
