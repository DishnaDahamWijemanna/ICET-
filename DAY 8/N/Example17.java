import java.util.*;
public class Example17 {
	public static int[] ar={60,20,10,40,90,80,100,50,30};
	public static void sortArray(){
        for(int i=0;i<ar.length;i++){
            for(int j=0; j<ar.length-1; j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
            System.out.println(Arrays.toString(ar));
        }
	}
	public static void main(String args[]){	
		System.out.println(Arrays.toString(ar));//[60,20,10,40,90,80,100,50,30,70]
		sortArray();
		
	}
}


