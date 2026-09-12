import java.util.*;
class Example10{
		public static void main(String args[]){
				int [] ar = {6,3,3,2,4,1,6,6,2,4};
				int z=0;
				int y=0;
				for(int i=0;i<ar.length;i++){
						if(ar[i]==3 | ar[i]==6){
							y++;
						}
				}
				for(int i=0;i<ar.length;i++){
						if(ar[i]%2==1){
							z++;
						}	
				}
				System.out.println("the number of times '3' and '6' is rolled - "+y);
				System.out.println("the number of times odd numbers are rolled - "+z);
				boolean finder = true;
				for(int i=0;i<ar.length;i++){
						if(ar[i]==5){
							finder = true;
							break;
						}else{
							finder = false;
						}	
				}
				if(finder==true){
					System.out.print("number 5 is rolled");
						
				}else{
					System.out.print("number 5 is not rolled");
				}
				
		}
}
