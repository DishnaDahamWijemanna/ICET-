import java.util.*;
class Example{
	public static void main(String[] args){
		final int x=100;
		int y;
		if(x>0){
			y=200;
		}
		System.out.println(x); 
		System.out.println(y);  //Illegal, initialization error
	} 
}

