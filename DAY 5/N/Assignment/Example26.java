import java.util.*;
class Example26{
		public static void main(String args[]){
				Random ran = new Random();
				Scanner input = new Scanner(System.in);
				System.out.print("Enter number that you want to get from dice : ");
				int uI = input.nextInt();
				int rDN = ran.nextInt(6)+1;
				while(rDN!=uI){
					System.out.println(rDN);
					rDN = ran.nextInt(6)+1;
				}	
		}
		
}
