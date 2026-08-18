import java.util.Scanner;
class Example58 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: ");
		int y = input.nextInt();

		System.out.print("Enter month: ");
		int m = input.nextInt();

		System.out.print("Enter day: ");
		int d = input.nextInt();

		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;

		String dayName = "";

		if(d0 == 0){
			dayName = "Sunday";
		}else if (d0 == 1){
			dayName = "Monday";
		}else if (d0 == 2){
			dayName = "Tuesday";
		}else if (d0 == 3){
			dayName = "Wednesday";
		}else if (d0 == 4){
			dayName = "Thursday";
		}else if (d0 == 5){
			dayName = "Friday";
		}else if (d0 == 6){
			dayName = "Saturday";
		}
		System.out.println("Day of the week: " + dayName);
	}
}

