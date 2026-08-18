import java.util.*;
class Example12{
	public static void increment(int x){
		System.out.println("start increment : "+x);
		x++;
		System.out.println("end increment : "+x);
	}
	public static void main(String args[]){
		int x=100;
		System.out.println("Start main : "+x);
		increment(x);//-->
		System.out.println("End main   : "+x);
	}
}

