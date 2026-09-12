import java.util.*;
class Example12{
		public static double tot=0;
		public static void main(String args[]){
				double [] ar = new double[9];
				Scanner sc = new Scanner(System.in);
				for(int i =0;i<ar.length;i++){
					System.out.print("Enter the Student "+(i+1)+" Marks : ");
					ar[i] =sc.nextDouble();
				}
				System.out.println();
				for(int i=0;i<ar.length;i++){
					tot += ar[i];	
				}
				System.out.println("the total marks of Student - "+tot);
				System.out.println("the average mark of the student - "+tot/ar.length);
				double min = ar[0];
				for(int i=1;i<ar.length;i++){
						if(ar[i]<=min){
								min=ar[i];
						}
				}
				System.out.println("maximum mark of the student - "+min);
				double max = 0;
				for(int i=0;i<ar.length;i++){
						if(ar[i]>=max){
								max=ar[i];
						}
				}
				System.out.println("maximum mark of the student - "+max);
				int y = 0;
				for(int i=0;i<ar.length;i++){
					if(ar[i]>75){
							y++;
					}	
				}
				System.out.println("how many marks are greater than 75 - "+y);
				int z = 0;
				for(int i=0;i<ar.length;i++){
					if(ar[i]<45){
							z++;
					}	
				}
				System.out.println("how many marks are less than 45 - "+z);
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
					System.out.print("Student get a 100 marks");
						
				}else{
					System.out.print("Student didn't get a 100 marks");
				}
		}
}
