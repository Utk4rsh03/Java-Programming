import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] phy = new int[n], chem = new int[n], math = new int[n];
        double[] perc = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            phy[i] = sc.nextInt();
            chem[i] = sc.nextInt();
            math[i] = sc.nextInt();
            if (phy[i] < 0 || chem[i] < 0 || math[i] < 0) {
                i--;
                continue;
            }
        }

        for (int i = 0; i < n; i++) {
            perc[i] = (phy[i] + chem[i] + math[i]) / 3.0;
            if (perc[i] >= 90) grade[i] = 'A';
            else if (perc[i] >= 75) grade[i] = 'B';
            else if (perc[i] >= 60) grade[i] = 'C';
            else if (perc[i] >= 50) grade[i] = 'D';
            else grade[i] = 'F';
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Physics: " + phy[i] + " Chemistry: " + chem[i] + " Maths: " + math[i] + " Percentage: " + perc[i] + " Grade: " + grade[i]);
        }
    }
}
