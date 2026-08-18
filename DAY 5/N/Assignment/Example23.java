import java.util.*;
class Example23{
		public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int i = 1;
		System.out.print("Input an integer number "+i+", input use -1  to terminate : ");
		int num = input.nextInt();
		int g1k =0;
		int l1k =0;
		
		while(num!=-1){
			if (num>=1000){
				g1k++;
			}else{
				l1k++;	
			}
			i++;
			System.out.print("Input an integer number "+i+", input use -1  to terminate : ");
			num = input.nextInt();
		}
		System.out.println(g1k+" numbers were less than 1000");
		System.out.println(l1k+" numbers were greater than 1000");
	}
}
