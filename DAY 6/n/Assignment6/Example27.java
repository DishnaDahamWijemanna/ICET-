import java.util.*;
class Example27{
		public static boolean findEIE(int num) {
				num = Math.abs(num);
				if (num == 0) {
					return true;
				}

				for (; num > 0; num /= 10) {
					int digit = num % 10;

					if (digit % 2 != 0) {
						return false;
					}
				}

				return true;
                
			}
			
		
		public static void main(String args[]){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter a integer value : ");
				int number = sc.nextInt();
				
				boolean result = findEIE(number);
				System.out.println("Are all digits even? " + result);
				
	}
}	

