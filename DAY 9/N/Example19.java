import java.util.*;
class Example19{
		public static void main(String args[]){
				Random r = new Random();
				int [] ar = new int[50];
				for(int i =0;i<ar.length;i++){
						ar[i]=r.nextInt();
				}  
				System.out.println(Arrays.toString(ar));
				System.out.println();
				int [] new1 = new int [ar.length];
				for(int i =0,y=ar.length-1;i<ar.length;i++,y--){
						new1 [i] = ar[y];
				}
				System.out.println(Arrays.toString(new1));
				int negativeCount = 0;
				for (int num : ar) {
					if (num < 0) {
						negativeCount++;
					}
				}
				System.out.println();
				double probability = (double) negativeCount / ar.length;
				System.out.println("Probability of negative numbers: " + probability);
		}
}
