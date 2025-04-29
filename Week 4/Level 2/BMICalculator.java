import java.util.*;

public class BMICalculator {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightM = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightM * heightM);
        }
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] members = new double[10][3];
        for (int i = 0; i < 10; i++) {
            members[i][0] = sc.nextDouble();
            members[i][1] = sc.nextDouble();
        }
        calculateBMI(members);
        for (int i = 0; i < 10; i++) {
            System.out.println("Weight: " + members[i][0] + " Height: " + members[i][1] + " BMI: " + members[i][2] + " Status: " + getStatus(members[i][2]));
        }
    }
}
