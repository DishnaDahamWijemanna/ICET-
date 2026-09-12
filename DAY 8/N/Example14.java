import java.util.*;
class Example14{
	public static void main(String args[]){	
		Scanner input=new Scanner(System.in);
		int[] dupRemovedAr=new int[0];
		L1:do{
			System.out.print("Input an integer (press -1 to terminate) : ");
			int num=input.nextInt();
			if(num==-1){
				break;
			}
			L2:for (int i = 0; i < dupRemovedAr.length; i++){
				if(dupRemovedAr[i]==num){
					System.out.println("Duplicate element...");
					continue L1;
				}
			}
			int[] tempAr=new int[dupRemovedAr.length+1];
			for (int i = 0; i < dupRemovedAr.length; i++){
				tempAr[i]=dupRemovedAr[i];
			}
			dupRemovedAr=tempAr;
			dupRemovedAr[dupRemovedAr.length-1]=num;
		}while(true);
		System.out.println(Arrays.toString(dupRemovedAr));
	}
}
