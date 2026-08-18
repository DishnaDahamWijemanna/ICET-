import java.util.*;
class Example10{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				int total = 0;
				
				int min = 0;
				int max = 0;
				for(int i =1;i<=10;i++){
						
						System.out.print("Enter the Subject "+i+" marks : ");
						int mark = input.nextInt();
						total += mark;
							if(i==1){
								max=mark;
								min=mark;
							}else{
								if(mark>max){
									max=mark;
								}
								if(mark<min){
									min=mark;
								}
							
							}
						
				}
				int avg =total/10;
				System.out.println("\nTotal   : " + total);
				System.out.println("Max     : " + max);
				System.out.println("Min     : " + min);
				System.out.println("Average : " + avg);
				
		}
}
