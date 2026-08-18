import java.util.*;
class Example10{
	public static int fact(int num){
		int fact=1;
		for(int i=num;i>0; i--){
			fact*=i;
		}
		return fact;
	}
	public static void main(String args[]){
		for (int i = 0; i < 10; i++){
			System.out.println(i+"! : "+fact(i));
		}
	}
}


