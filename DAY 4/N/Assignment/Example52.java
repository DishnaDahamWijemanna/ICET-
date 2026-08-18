import java.util.*;
class Example52{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter the X coordinate : ");
				double x = input.nextDouble();
				
				System.out.print("Enter the Y coordinate : ");
				double y = input.nextDouble();
				
				if(y>0){
					if(x>0){
						System.out.print("Quadrant I");
					}else{
						System.out.print("Quadrant II");
					}	
				}else if(y<0){
					if(x>0){
						System.out.print("Quadrant IV");
					}else{
						System.out.print("Quadrant III");
					}
				}else{
						System.out.print("it is (0,0)");
				}
		}
}
