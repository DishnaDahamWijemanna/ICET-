import java.util.*;
class Example50{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter angle a: ");
			int a = input.nextInt();
			
			System.out.print("Enter angle b: ");
			int b = input.nextInt();
			
			System.out.print("Enter angle c: ");
			int c = input.nextInt();
			if(a > 0 && b > 0 && c > 0 && (a + b + c == 180)){
				System.out.println("The triangle is valid.");
			}else{
				System.out.println("The triangle is NOT valid.");	
			}	
		}
}
}
