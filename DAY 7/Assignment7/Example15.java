import java.util.*;
class Example15{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			Random r = new Random();
			System.out.print("Enter the array length : ");
			int z = sc.nextInt();
				
			int [] ar = new int[z];
			for(int i =0;i<ar.length;i++){
				ar[i] = r.nextInt(101);
			}
			int y = 0;
			System.out.println(Arrays.toString(ar));
			
			for(int i = 0;i<ar.length;i++){
				if(i%2==1){
					if(ar[i]%2==1){
						y++;
					}
				}
			}
			System.out.println("how many odd numbers are in the odd index of an array - "+y);
			boolean finder = true;
				for(int i=0;i<ar.length;i++){
						if(ar[i]==100){
							finder = true;
							break;
						}else{
							finder = false;
						}	
				}
				if(finder==true){
					System.out.print("number 100 is there");
						
				}else{
					System.out.print("number 100 is not there");
				}
				System.out.println();
			double min = ar[0];
			for(int i=1;i<ar.length;i++){
					if(ar[i]<=min){
							min=ar[i];
					}
			}
			System.out.println();
			System.out.println("maximum mark of the student - "+min);
			double max = 0;
			for(int i=0;i<ar.length;i++){
					if(ar[i]>=max){
							max=ar[i];
					}
			}
			System.out.println();
			System.out.println("maximum mark of the student - "+max);
		}
}
