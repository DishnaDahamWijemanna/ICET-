import java.util.*;
class Example{
	public static void main(String args[]){
		int x=100;
		System.out.println(x); 
		{
			int y=200;
			{
				int z=300;
				System.out.println(x); 
				System.out.println(y);
				System.out.println(z); 
			}
			System.out.println(x); 
			System.out.println(y); 
			System.out.println(z); //Line 7
		}
		System.out.println(x); 
		System.out.println(y); //Line 9
		System.out.println(z); //Line 10
	}
}

