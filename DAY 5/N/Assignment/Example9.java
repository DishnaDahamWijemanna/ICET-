import java.util.*;
class Example9{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				int num =0;
				int x =0;
				for(int i =1;i<=50;i++){
					System.out.print("Enter the number"+i+" : ");
					num = input.nextInt();
					if(num>100){
						x++;
					}
				
				}
				System.out.println();
				System.out.print(x+" numbers are more than 100");
				
		}
}
