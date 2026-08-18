import java.util.*;
class Example2{
	public static void main(String[] args){
		int x=100;
		System.out.println(x); //Line 1
		{
			int y=200;
			System.out.println(x); //Line 2
			System.out.println(y); //Line 3
			{
				int z=300;
				System.out.println(x); //Line 4
				System.out.println(y); //Line 5
				System.out.println(z); //Line 6
			}
			System.out.println(x); //Line 7
			System.out.println(y); //Line 8
			System.out.println(z); //Line 9
		}
		System.out.println(x);	//Line 10
		System.out.println(y);  //Line 11
		System.out.println(z);  //Line 12
	} 
}
