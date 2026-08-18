import java.util.*;
class Example1{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int a,b,c,d,e,f,g,h,i,j;
		
		
		int [] marks = new int[10];
		
		for(int z= 0;z<=9;z++){
			
			System.out.print("Input marks for student "+(z+1)+" : ");
			marks[z]=input.nextInt();
		
		}
		
		int total=0;
		for(int y=0;y<=9;y++){
	
		
		
		total+=marks[y];
		
		}
		double avg=total/10.0;
		System.out.println("Total marks   : "+total);
		System.out.println("Average marks : "+avg);
	}
}
