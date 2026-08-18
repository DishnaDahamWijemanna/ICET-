import java.util.*;
class Example10{
		public static void main(String args[]){
				byte a=0;
				short b=0;
				int c =0;
				long d =0;
				
				d=a;//Wider conversion (Implicitly casting)
				d=b;//Wider conversion (Implicitly casting)
				d=c;//Wider conversion (Implicitly casting)
				
				c=a;//Wider conversion (Implicitly casting)
				c=b;//Wider conversion (Implicitly casting)
				c=(int)d;//narrow casting (int to short)
				
				b=a;//line7
				b=(short)c;//narrow casting 
				b=(short)d;//narrow casting 
				
				
				a=(byte)b;//narrow casting 
				a=(byte)c;//narrow casting 
				a=(byte)d;//narrow casting 
				
		}
}
