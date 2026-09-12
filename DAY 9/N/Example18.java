import java.util.*;
class Example18{
		public static void main(String args[]){
			String[] month = {"January", "February", "March", "April", "May", "June", 
                  "July", "August", "September", "October", "November", "December"};
            String[] arrMonth = new String[month.length];
            for (int i = 0; i < month.length; i++) {
				arrMonth[i] = month[i];
			}
			System.out.println("month == arrMonth ??? "+ (month==arrMonth));
		}
}
