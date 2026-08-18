import java.util.*;
class Example28{
		public static void main(String args[]){
				Scanner input = new Scanner(System.in);
				System.out.print("Enter an integer number : ");
				int num = input.nextInt();
				
				int rNum = 0;
				for(int i = num;i%10!=0;i/=10){
					int mod = i%10;
					rNum = (rNum*10)+mod;
				}						
				
				System.out.print(rNum);
				
		}
	}
