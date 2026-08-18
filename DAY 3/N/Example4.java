import java.util.*;
class Example4{
		public static void main(String args[]){
				System.out.println(Integer.MAX_VALUE);
				System.out.println(2147483647);//max of int
				//System.out.println("2147483648");//illegal
				
				int x;
				x = 2147483647; //legal
				//x= 2147483647;//illegal
				System.out.println(2147483648L);//legal->64bits
				
				
				System.out.println(Long.MAX_VALUE);
				System.out.println(9223372036854775807L);
				//System.out.println(9223372036854775808L);
				System.out.println(9223372036854775808f); //or f
				System.out.println(9223372036854775808D); //or d

		}
}
