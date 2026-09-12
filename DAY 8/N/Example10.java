import java.util.*;
public class Example10 {

    public static void main(String args[]){	


		int[] ar={10,20,30,40,50};
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50]
		int [] tempAr = new int[ar.length-1];
        for(int i = 0;i<tempAr.length;i++){
            tempAr[i] =  ar[i];
        }
        ar = tempAr;
        
		
		System.out.println(Arrays.toString(ar));//[10,20,30,40]
	}

}
