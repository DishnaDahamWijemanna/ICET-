import java.util.*;
class Example{
	public static void main(String[] args){
		System.out.println("Start main");
		for (int i = 0; i < 10; i++){
			if(i%2==0){
				continue;
			}
			System.out.println("i : "+i);
		}
		System.out.println("End main");
	} 
}





