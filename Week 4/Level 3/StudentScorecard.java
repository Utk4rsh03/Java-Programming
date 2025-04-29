import java.util.Scanner;

public class StudentScorecard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0, max = 0;

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
            if (marks[i] > max) max = marks[i];
        }

        double average = total / 5.0;
        char grade = getGrade(average);

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Highest: " + max);
        System.out.println("Grade: " + grade);
    }

    static char getGrade(double avg) {
        if (avg >= 90) return 'A';
        if (avg >= 75) return 'B';
        if (avg >= 60) return 'C';
        if (avg >= 40) return 'D';
        return 'F';
    }
}
