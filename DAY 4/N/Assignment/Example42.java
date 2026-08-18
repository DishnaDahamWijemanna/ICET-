import java.util.*;
class Example42 {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
				System.out.print("Enter your waist size in inches(28-42): ");
				int wSize = input.nextInt();
				if (wSize >= 28 && wSize <= 29) {
					System.out.println("Size: X-small");
				} else if (wSize >= 30 && wSize <= 31) {
					System.out.println("Size: Small ");
				} else if (wSize >= 32 && wSize <= 34) {
					System.out.println("Size: Medium");
				} else if (wSize >= 36 && wSize <= 38) {
					System.out.println("Size: Large");
				} else if (wSize >= 40 && wSize <= 42) {
					System.out.println("Size: X-Large");
				} else {
					System.out.println("Invalid or unavailable size!");
			}
	}
}
