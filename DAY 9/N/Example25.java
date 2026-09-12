import java.util.*;
class Example25{
		public static void main(String args[]){
				int [] dollar = {15000, 21000, 18500, 12275, 35550, 28760, 17175, 10500};
				double [] rupee = new double [dollar.length];
				for(int i =0;i<dollar.length;i++){
						rupee[i] = ((double) dollar[i]) * 366.1;
						
				}
				
				int uppervalue = 7500000;
				int more_count = 0;
				int less_count = 0;
				for(int i =0;i<rupee.length;i++){
					if(rupee[i]>=uppervalue){
						more_count ++;
					}else{
						less_count ++;
					}
				}
				System.out.println("how many software engineers get more than Rs.7,500,000 : "+more_count);
				System.out.println("how many software engineers get less than Rs.7,500,000 : "+less_count);
				
				double [] uVal = new double[rupee.length];
				double [] lVal = new double[rupee.length];
				for(int i = 0,y=0;i<rupee.length;i++,y++){
					if(rupee[i]>=uppervalue){
						uVal[i]=rupee[i];
					}else{
						lVal[i]=rupee[i];
					}
				
				}
				System.out.println(Arrays.toString(uVal));
				System.out.println(Arrays.toString(lVal));
		}
}
