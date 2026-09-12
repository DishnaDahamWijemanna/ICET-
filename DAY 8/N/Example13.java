import java.util.*;
class Example13{
	public static void main(String args[]){	
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer (press -1 to terminate) : ");
		int num=input.nextInt();
		int[] dupRemovedAr=new int[0];
		while(num!=-1){
			boolean isDuplicate=false;
			for(int i=0; i<dupRemovedAr.length;i++){
				if(dupRemovedAr[i]==num){
					isDuplicate=true;
					System.out.println("Duplicate number....");
					break;
				}
			}
			if(!isDuplicate){
				int[] tempAr=new int[dupRemovedAr.length+1];
				for (int i = 0; i < dupRemovedAr.length; i++){
					tempAr[i]=dupRemovedAr[i];
				}
				dupRemovedAr=tempAr;
				dupRemovedAr[dupRemovedAr.length-1]=num;
			}
			System.out.print("Input an integer (press -1 to terminate) : ");
			num=input.nextInt();
		}
		System.out.println(Arrays.toString(dupRemovedAr));
	}
}

