import java.util.*;
class Example36 {
    public static void main(String[] args) {
        String[] cricket = {"Shanaka", "Dinesh", "Amesh", "Lahiru", "Dilshan", 
							"Hashan", "Wenura", "Randika", "Dasun", "Thisara", "Kasun", "Nisal", "Praveen"};
        String[] football = {"Anjana", "Chamara", "Kamal", "Dhanuka", "Shanaka",
							"Kasun", "Dineth", "Sahan", "Wenura", "Amesh", "Mahesh", "Randika", "Thisara"};
        String[] both = new String[cricket.length];
        int countBoth = 0;

        for (int i = 0; i < cricket.length; i++) {
            for (int j = 0; j < football.length; j++) {
                if (cricket[i].equals(football[j])) {
                    both[countBoth++] = cricket[i];
                    break;
                }
            }
        }
        String[] resultBoth = new String[countBoth];
        for (int i = 0; i < countBoth; i++) {
            resultBoth[i] = both[i];
        }
        System.out.println("Both Cricket and Football: " + Arrays.toString(resultBoth));
        String[] either = new String[cricket.length + football.length];
        int countEither = 0;
        for (int i = 0; i < cricket.length; i++) {
            either[countEither++] = cricket[i];
        }
        for (int i = 0; i < football.length; i++) {
            boolean exists = false;
            for (int j = 0; j < countEither; j++) {
                if (football[i].equals(either[j])) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                either[countEither++] = football[i];
            }
        }
        String[] resultEither = new String[countEither];
        for (int i = 0; i < countEither; i++) {
            resultEither[i] = either[i];
        }
        System.out.println("Cricket or Football: " + Arrays.toString(resultEither));
    }
}
