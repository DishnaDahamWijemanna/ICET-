import java.util.*;
class Example2{
		public static int[] ar={60,20,10,40,30,80,100,50,90,70};
		public static void sortArray(){
			/*if(ar[1]<ar[0]){
					int temp =ar[0];
					ar[0]=ar[1];
					ar[1]=temp;
				}
				
				if(ar[2]<ar[0]){
					int temp =ar[0];
					ar[0]=ar[2];
					ar[2]=temp;
				}
				if(ar[2]<ar[1]){
					int temp =ar[1];
					ar[1]=ar[2];
					ar[2]=temp;
				}*/
				for(int i =1;i<ar.length;i++){
						for(int j=0;j<i;j++){
							if(ar[i]<ar[j]){
								int temp =ar[i];
								ar[i]=ar[j];
								ar[j]=temp;
							}
							
						}
				}
		}

		public static void main(String args[]){
			System.out.println(Arrays.toString(ar));//[60,20,10,40,30,80,100,50,90,70]
			sortArray();
			System.out.println(Arrays.toString(ar));//[10,20,30,40,50,60,70,80,90,100]

				
		}
}
