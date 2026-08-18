import java.util.*;
class Example12{
	public static void main(String args[]){
		byte a;
		short b=127;
		
		//a=b;
		a=(byte)b; //assign last 8bits of b to a [Narrow Casting]
		System.out.println(a+" "+b); //127 127
	}
}


