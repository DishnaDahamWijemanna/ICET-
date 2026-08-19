import java.util.*;
class Example14{
		public static void add(int num1,int num2){
			System.out.print(num1+" + "+num2+" = "+(num1+num2));
		}
		public static void subtraction(int num1,int num2){
			System.out.print(num1+" - "+num2+" = "+(num1-num2));
		}
		public static void multiplication(int num1,int num2){
			System.out.print(num1+" * "+num2+" = "+(num1*num2));
		}
		public static void dividend(int num1,int num2){
			System.out.print(num1+" / "+num2+" = "+(num1/num2));
		}
		public static void reminder(int num1,int num2) {
			System.out.print(num1+" % "+num2+" = "+(num1%num2));
		}
		public static void power(int num1,int num2){
			System.out.print(num1+" ^ "+num2+" = "+((int)Math.pow(num1,num2)));
		}
		
	
		public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the first number : ");
				int num1 = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter the second number : ");
				int num2 = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Enter the operator (+,-,*,/,%,^) : ");
				String op = sc.nextLine();
				
				switch(op){			
					case "+" :
						add(num1,num2);
						break;
					case "-" :
						subtraction(num1,num2);
						break;
					case "*" :
						multiplication(num1,num2);
						break;
					case "/" :
						dividend(num1,num2);
						break;
					case "%" :
						reminder(num1,num2);
						break;
					case "^" :
						power(num1,num2);
						break;
				}
		}
}
