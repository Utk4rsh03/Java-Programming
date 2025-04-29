import java.util.Scanner;

public class NumberSign {
    public static int checkSign(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = checkSign(number);
        System.out.println("Result: " + result);
    }
}
