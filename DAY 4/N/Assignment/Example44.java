import java.util.*;
class Example44 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a day number for February 2022 (1 - 28): ");
		int day = input.nextInt();

		if (day >= 1 && day <= 28) {
			int dayName = day % 7;

			switch (dayName) {
			case 1:System.out.println("Tuesday");
				break;
			case 2:System.out.println("Wednesday");
				break;
			case 3:System.out.println("Thursday");
				break;
			case 4:System.out.println("Friday");
				break;
			case 5:System.out.println("Saturday");
				break;
			case 6:System.out.println("Sunday");
				break;
			case 0:System.out.println("Monday");
				break;
			}

        }else{
			System.out.println("Invalid day! Please enter a number between 1 and 28.");
		}
	}
}
