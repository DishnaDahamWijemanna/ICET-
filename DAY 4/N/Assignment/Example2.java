import java.util.*;
class Example2{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter any integer number : ");
				int num = input.nextInt();
				int absolute;
				if(num<0){
					absolute = -num;
					System.out.print("absolute : "+absolute);
				}else{
					absolute = num;
					System.out.print("absolute : "+absolute);
				}
				
		}
}
