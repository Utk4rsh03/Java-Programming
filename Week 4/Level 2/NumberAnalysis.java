import java.util.*;

public class NumberAnalysis {
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            if (isPositive(numbers[i])) {
                System.out.println(isEven(numbers[i]) ? "Even" : "Odd");
            } else {
                System.out.println("Negative");
            }
        }
        int res = compare(numbers[0], numbers[4]);
        if (res == 0) System.out.println("Equal");
        else if (res == 1) System.out.println("First is greater");
        else System.out.println("First is smaller");
    }
}
