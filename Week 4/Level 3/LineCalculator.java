import java.util.Scanner;

public class LineCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = getDistance(x1, y1, x2, y2);
        double[] eq = getLineEquation(x1, y1, x2, y2);

        System.out.println("Distance: " + distance);
        System.out.println("Equation: y = " + eq[0] + "x + " + eq[1]);
    }

    static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }
}
