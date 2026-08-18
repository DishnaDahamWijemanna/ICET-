import java.util.*;
class Example2{
		public static void main (String args[]){
				float f=100; //Implicitly convert int to float
				System.out.println(f); //100.0
				
				//f=100.0; //Illegal Literals(100.0--> 64bits);
				f=100.0f; //or F
				System.out.println(f); //100.0

		}
}
