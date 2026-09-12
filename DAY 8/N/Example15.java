import java.util.*;
class Example15{
	public static void main(String args[]){	
		int[] ar={10,20,30,40,50,30,20,70,80,50};
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50,30,20,70,80,50]
		//Insert code here to remove duplicates
		int[] dupRemovedAr=new int[0];
		L1:for (int i = 0; i < ar.length; i++){
			L2:for(int j=0; j<dupRemovedAr.length; j++){
				if(dupRemovedAr[j]==ar[i]){
					continue L1;
				}
			}
			int[] tempAr=new int[dupRemovedAr.length+1];
			for(int j=0; j<dupRemovedAr.length; j++){
				tempAr[j]=dupRemovedAr[j];
			}
			tempAr[tempAr.length-1]=ar[i];
			dupRemovedAr=tempAr;
		}
		ar=dupRemovedAr;
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50,70,80]
		
	}
}

