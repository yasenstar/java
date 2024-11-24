import java.util.*;

public class App4_2 {
    public static void main(String[] args) {
        int testScore;
        Scanner reader = new Scanner(System.in);
        System.out.print("Please input test score (integer - 0~100): ");
        testScore = reader.nextInt();

        char grade;
        if (testScore >= 90) {
            grade = 'A';
        }
        else if (testScore >= 80) {
            grade = 'B';
        }
        else if (testScore >= 70) {
            grade = 'C';
        }
        else if (testScore >= 60) {
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        System.out.println("The grade of scroe is " + grade);
    }
}
