import java.util.*;
class Example3{
		public static void main(String args[]){	
		int[] st0=new int[4];
		int[] st1=new int[4];
		int[] st2=new int[4];
		int[] st3=new int[4];
		int[] st4=new int[4];
		int[] st5=new int[4];
		int[] st6=new int[4];
		int[] st7=new int[4];
		int[] st8=new int[4];
		int[] st9=new int[4];
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Input marks for student 1....");
		for(int j=0; j<4; j++){
			System.out.print("\tSubject "+(j+1)+" : ");
			st0[j]=input.nextInt();
		}
		
		System.out.println("Input marks for student 2....");
		for(int j=0; j<4; j++){
			System.out.print("\tSubject "+(j+1)+" : ");
			st1[j]=input.nextInt();
		}
		
		System.out.println("Input marks for student 3....");
		for(int j=0; j<4; j++){
			System.out.print("\tSubject "+(j+1)+" : ");
			st2[j]=input.nextInt();
		}
		
		System.out.println("Input marks for student 4....");
		for(int j=0; j<4; j++){
			System.out.print("\tSubject "+(j+1)+" : ");
			st3[j]=input.nextInt();
		}
	}
}
