import java.util.*;
class Example15{
		public static void swap(){
				int a = 50;
				int b = 40;
				
				a = a+b;
				b = a-b;
				a = a-b;
				
				System.out.println("a - "+a);
				System.out.println("b - "+b);
		}
		public static void main(String args[]){
				swap();
		}
}
