import java.util.*;
class Example27{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter a input a value to get sum of digits : ");
				int num = input.nextInt();
				int mod;
				int sum =0;
				for(int i =num;(i%10)!=0;i/=10){
					mod = i%10;
					sum += mod;
					
				}	
				System.out.print(sum);
		}
}
