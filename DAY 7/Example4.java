import java.util.*;
class Example4{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input number of Students :");
		final int nOS = input.nextInt();
		
		int[] marks=new int[nOS];
		
		//Read marks (Random number 0 to 100)
		Random r=new Random();
		for(int i=0; i<nOS; i++){
			//System.out.print("Input marks for student "+(i+1)+" : ");
			marks[i]=r.nextInt(101); //0 to 100
		}

		int total=0;
		for (int i = 0; i < nOS; i++){
			total+=marks[i];
		}
		
		int max=marks[0];
		for(int i=1; i<nOS; i++){
			if(marks[i]>max){
				max=marks[i];
			}
		}
		
		int min=marks[0];
		for(int i=1; i<nOS; i++){
			if(marks[i]<min){
				min=marks[i];
			}
		}
		
		double avg=total/10.0;
		
		//Insert code here to print marks [56, 34, 89, 12, ....]
		System.out.print("[");
		for (int i = 0; i < nOS; i++){
			System.out.print(marks[i]+", ");	
		}
		System.out.println("\b\b]");
		
		System.out.println("Max   marks   : "+max);
		System.out.println("Min   marks   : "+min);
		System.out.println("Total marks   : "+total);
		System.out.println("Average marks : "+avg);
	}
}
