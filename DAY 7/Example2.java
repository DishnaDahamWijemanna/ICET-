import java.util.*;
class Example2{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in); 
		int[] num = new int[4];
		for(int i =0;i<=3;i++){
		System.out.print("Input number "+(i+1)+" : ");
		num[i]=input.nextInt();
		
		}
		int max=num[0];
		for(int i=0;i<=3;i++){
			
			
			
			if(num[i]>max){
				max=num[i];
			}
			
		}
		System.out.println("Max : "+max);
	}
}

