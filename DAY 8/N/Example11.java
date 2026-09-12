import java.util.*;
public class Example11 {
    public static void main(String args[]){	
		int[] ar={10,20,30,40,50};
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50]
		int [] temp = new int[ar.length-1];
        for(int i =0;i<temp.length;i++){
            temp[i] = ar[i+1];

        } 
        
        ar = temp;
       
		
		System.out.println(Arrays.toString(ar));//[20,30,40,50]
	}

}
