import java.util.*;
class Q29 {
    public static String[] addSubject(String[] subject) {
        String[] temp = new String[subject.length + 1];
        for (int i = 0; i < temp.length; i++) {
            if (i < 7) {
                temp[i] = subject[i];
            } else if (i == 7) {
                temp[i] = "Music";
            } else {
                temp[i] = subject[i - 1];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        String[] subject = {"Mathematics", "Science", "English",
							"Sinhala", "History", "Buddhisum", "Business Studies", "Computer Studies"};
        String[] result = addSubject(subject);
        System.out.println(Arrays.toString(result));
    }
}
