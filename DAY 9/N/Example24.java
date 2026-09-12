import java.util.*;
class Example24{
		public static void increment(double [] salary){
			for(int i =0;i<salary.length;i++){
				salary[i] +=5000;
			}
		 }

		public static void main(String args[]){
			double[] salary={71,86,54,89};
			for (double s : salary) {
            System.out.print(s + " ");
			}
			System.out.println();
			increment(salary); 
			for (double s : salary) {
				System.out.print(s + " ");
			}
	
		}
}
