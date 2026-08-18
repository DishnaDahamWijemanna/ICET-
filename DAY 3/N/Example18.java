import java.util.*;
class Example18{
	public static void main(String args[]){
		System.out.println('A');
		System.out.println((int)'A'); //Wider casting (cast char to int)
		System.out.println('A'+0); //wider conversion (char to int)
		System.out.println(65); 
		System.out.println((char)65); //Narrow casting (int to char)
		System.out.println((double)65); //Wider conversion
	}
}

