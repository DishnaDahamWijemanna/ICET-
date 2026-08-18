import java.util.*;
class Example16{
	public static void main(String args[]){
		int total=756;
		int n=10;
		double avg=total/n; //integer division
		System.out.println("Average : "+avg);//75.0
		
		avg=(double)total/n; //floating point division
		System.out.println("Average : "+avg);//75.6
		
		avg=total/(double)n; //floating point division
		System.out.println("Average : "+avg);//75.6
	}
}

