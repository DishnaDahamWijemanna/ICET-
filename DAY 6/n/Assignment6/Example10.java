import java.util.*;
class Example10{
		public static void findDM(){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter how much interest do you want for month : ");
			double num = input.nextFloat();
			
			double dMoney = ((num/20)*(12*100));
			System.out.printf("you have to deposite anually "+dMoney);
		}
		
		public static void main(String args[]){
				findDM();
		}
}
