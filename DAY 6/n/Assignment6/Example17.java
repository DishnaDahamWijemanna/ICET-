import java.util.*;
class Example17{
		public static void findHMM(){ //HMM mean how many multi.
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number that you want to get how many multiples in a range : ");
			int num =  sc.nextInt();
			 
			System.out.print("The lower bound of the range :  ");
			int r1 =  sc.nextInt();
			
			System.out.print("The upper bound of the range : ");
			int r2 =  sc.nextInt();
			int n = 0;
			for(int i = r1+1;i<r2;i++){
					if(i%num==0){
						n++;
					}
					
			}
			System.out.print("Multiples of "+num+" between "+r1+" and "+r2+" - "+n);
		}
		public static void main(String args[]){
				findHMM();
		}
}
