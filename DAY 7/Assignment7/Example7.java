import java.util.*;
class Example7{
		public static void main(String args[]){
				char [] bLetters = {'A','B','C','D','E','F','G','H','I','J',
									'K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
				System.out.println(Arrays.toString(bLetters));
				for(int i =0;i<bLetters.length;i+=2){
						System.out.print(bLetters[i]+" ");
						
				}
				System.out.println();
				
				for(int i =1;i<bLetters.length;i+=2){
						System.out.print(bLetters[i]+" ");
				}
				System.out.println();
				char [] new1 = new char[bLetters.length];
				for(int i =0,y = bLetters.length-1;i<bLetters.length;i++,y--){
						new1[i]=bLetters[y];
				}
				System.out.println(Arrays.toString(new1));
		}
}
