import java.util.*;
class Example3{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int[] marks=new int[10];
		
		for(int i=0; i<10; i++){
			System.out.print("Input marks for student "+(i+1)+" : ");
			marks[i]=input.nextInt();
		}
		int total=0;
		for (int i = 0; i < 10; i++){
			total+=marks[i];
		}
		int max=marks[0];
		int min=marks[0];
		for(int i = 1;i <=9;i++){
	
			if(marks[i]>max){
				max=marks[i];
				
			}		
		}
			for(int i = 1;i <=9;i++){
			if(marks[i]<min){
				min=marks[i];
			}
	
		}
		double avg=total/10.0;
		System.out.println("Max   marks   : "+max);
		System.out.println("Min   marks   : "+min);
		System.out.println("Total marks   : "+total);
		System.out.println("Average marks : "+avg);
	}
}

