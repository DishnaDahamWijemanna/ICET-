import java.util.*;

public class Example7 {
    public static void reverseAnArray(int []ar){
        int [] br = new int[ar.length];
       for (int i=0;i<ar.length;i++){
            br[i]=ar[i];
        }
        for(int i=0;i<ar.length;i++){
            ar[i]=br[ar.length-1-i];
        }
    }
    public static void main(String args[]){
		int[] ar={10,20,30,40,50,60,70,80,90};	
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50,60,70,80,90]
		
		reverseAnArray(ar);
		System.out.println(Arrays.toString(ar));//[90,80,70,60,50,40,30,20,10]
	}

}
