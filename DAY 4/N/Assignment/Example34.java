import java.util.*;
class Example34{
		public static void main (String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("How many books did you buying : ");
				int nBook = input.nextInt();
				
				final int bPrice =100;
				double Subtotal = nBook * bPrice;
				if (Subtotal>5000){
						double dis = Subtotal*0.10;
						double tot = Subtotal - dis;
						System.out.printf("Subtotal : %9.2f \n",Subtotal);
						System.out.printf("Discount : %9.2f \n",dis);
						System.out.printf("TOTAL    : %9.2f \n",tot);
						
				}else{
						double tot = Subtotal ;
						String dis = "-";
						System.out.printf("Subtotal : %9.2f \n",Subtotal);
						System.out.printf("Discount : %9.2s \n",dis);
						System.out.printf("TOTAL    : %9.2f \n",tot);
				}
		}
}
