import java.util.*;
class Example11{
		public static void main(String args[]){
				byte a=127;
				short b =0;
				
				b=a; //wider conversion
				System.out.println(a+" "+b); //127 127
				
				double d;
				d=a;// narrow casting
				System.out.println(a+" "+d);
		}
}
