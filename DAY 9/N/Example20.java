import java.util.*;
class Example20{
		public static void main(String args[]){
				char[] vowels1 = {'A', 'E', 'I', 'O', 'U'};
				char[] vowels2 = {'a', 'e', 'i', 'o', 'u'};
				char[] ar1 = new char[vowels1.length + vowels2.length];
				for (int i = 0; i < vowels1.length; i++) {
					ar1[i] = vowels1[i];
					ar1[i + vowels1.length] = vowels2[i];
				}
				for (char c : ar1) 
				System.out.print(c + " ");
				System.out.println();
				
				char [] ar2 = new char[vowels1.length+vowels2.length];
				for (int i = 0; i < vowels1.length; i++) {
					ar2[2 * i] = vowels1[i];
					ar2[2 * i + 1] = vowels2[i];
				}
				for (char c : ar2) 
				System.out.print(c + " ");
				System.out.println();
				char[] ar3 = new char[vowels1.length + vowels2.length];
				for (int i = 0; i < vowels1.length; i++) {
					ar3[2 * i] = vowels1[vowels1.length - 1 - i];
					ar3[2 * i + 1] = vowels2[vowels2.length - 1 - i];
				}
				for (char c : ar3) 
				System.out.print(c + " ");
				System.out.println();
				char[] ar4 = new char[vowels1.length + vowels2.length];
				for (int i = 0; i < vowels1.length; i++) {
					ar4[2 * i] = vowels1[i];
					ar4[2 * i + 1] = vowels2[vowels2.length - 1 - i];
				}
				for (char c : ar4) 
				System.out.print(c + " ");
				
		}
}
