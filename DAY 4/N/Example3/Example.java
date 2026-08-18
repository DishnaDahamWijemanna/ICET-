import java.util.*;
class Example{
		public static void main(String args[]){
				
				Scanner input = new Scaanner(System.in);

				
				System.out.print("Enter the input1")
				double a = input.nextDouble();
				
				System.out.print("Enter the input2")
				double b = input.nextDouble();
				
				System.out.print("Enter the input3")
				double c = input.nextDouble();
				
				System.out.print("Enter the input4")
				double d = input.nextDouble();
				int max= a;
				if(b>max){
					max=b;
				}
				if(c>max){
					max=c;
				}
				if(d>max){
					max=d;
				}
				//----------Output-----------------
				System.out.println("Maximum : "+max);

				
				
 				
		}
}
