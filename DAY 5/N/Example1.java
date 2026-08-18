import java.util.*;
class Example1{
	public static void main(String[] args){
		int x=100;
		System.out.println(x);
		{
			int y=200;
			System.out.println(x);
			System.out.println(y);
			x++;y++;
		}
		int x=1; //Illegal
		int y=2;
		System.out.println(x);
		System.out.println(y); 
	}
}
