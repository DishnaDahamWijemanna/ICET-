import java.util.*;
class Example14{
		public static void main(String args[]){
				char ch = 'a';
				double d;
				d=ch;//wider conversion char to double
				System.out.println(ch+" : "+d);// a 97.0
				
				d=67.0;
				//ch=d;//illegal
				ch=(char)d;
				System.out.println(ch+" : "+d);//A 65.0
		
		}
}
