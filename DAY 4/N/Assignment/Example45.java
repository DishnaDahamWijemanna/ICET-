import java.util.*;
class Example45{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the Row number : ");
				int row = input.nextInt();
				
				
				System.out.print("Enter the colum number : ");
				int col = input.nextInt();
				
				if((row>0 && row<9) || (col>0 && col<9)){
					if(row%2==0){
						if(col%2==0){
							System.out.print("You are Entered cell color is white");
						}else{
							System.out.print("You are Entered cell color is black");
						}
					}else{
						if(col%2==1){
							System.out.print("You are Entered cell color is white");
						}else{
							System.out.print("You are Entered cell color is black");
						}	
					}
				}else{
						System.out.print("Error ,enter a valid raw(1-8) or colum(1-8) number");
				}
		}	
}
