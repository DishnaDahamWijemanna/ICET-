import java.util.*;
class Example6{
		public static void main(String args[]){
				String [] day = new String[7];
				day[0]="Sunday";
				day[1]="Monday";
				day[2]="Tuesday";
				day[3]="Wednesday";
				day[4]="Thursday";
				day[5]="Friday";
				day[6]="Saturday";
				System.out.println(Arrays.toString(day));
				String [] new1 = new String[day.length]; 
				for(int i =0, y = day.length-1;i<day.length;i++,y--){
						new1[i]=day[y];
				}
				System.out.println(Arrays.toString(new1));
		}
}
