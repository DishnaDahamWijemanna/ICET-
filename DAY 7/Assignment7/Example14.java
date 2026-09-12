import java.util.*;
class Example14{
		public  static void main(String args[]){
			Random r = new Random();
			int [] ar = new int[20];
			for(int i =0;i<ar.length;i++){
				ar[i] = r.nextInt(101);
			}
			int y = 0;
			System.out.println(Arrays.toString(ar));
			for(int i = 0;i<ar.length;i++){
				if(ar[i]>=50){
					y++;
				}
			}
			System.out.println("how many students pass the assignment - "+y);
			boolean finder = true;
				for(int i=0;i<ar.length;i++){
						if(ar[i]>=90){
							finder = true;
							break;
						}else{
							finder = false;
						}	
				}
				if(finder==true){
					System.out.print("there are students with more than 90 marks");
						
				}else{
					System.out.print("there are no students with more than 90 marks");
				}
		}
}
