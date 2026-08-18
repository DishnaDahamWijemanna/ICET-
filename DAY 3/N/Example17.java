import java.util.*;
class Example17{
	public static void main(String args[]){
		long x=1000;
		byte b=10;
		//b= b+x; //Illegal
		b+=x; //Legal, Narrow conversion
		System.out.println(b+" "+x);
	}
}


