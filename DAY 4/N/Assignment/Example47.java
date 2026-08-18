import java.util.*;
class Example47 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter month (1-12): ");
		int month = input.nextInt();

		System.out.print("Enter day (1-31): ");
		int day = input.nextInt();

		String season = "";

		if ((month==12 && day>=21) || month==1 || month==2 || (month==3 && day<=19)) {
			season = "Winter";
		} 
		else if ((month==3 && day>=20) || month==4 || month==5 || (month==6 && day<=20)) {
			season = "Spring";
		} 
		else if ((month==6 && day>=21) || month==7 || month==8 || (month==9 && day<=21)) {
			season = "Summer";
		} 
		else if ((month==9 && day>=22) || month==10 || month==11 || (month==12 && day<=20)) {
			season = "Autumn";
		} 
		else {
			season = "Invalid Date";
		}
		System.out.println("Season: " + season);
			
	}
}
