import java.util.Scanner;

public class NumberChecker2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = getDigitsArray(number, count);

        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares: " + sumOfSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(number, digits));
        displayFrequency(digits);
    }

    static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    static int[] getDigitsArray(int num, int count) {
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    static boolean isHarshad(int number, int[] digits) {
        return number % sumOfDigits(digits) == 0;
    }

    static void displayFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0)
                System.out.println("Digit: " + freq[i][0] + " Frequency: " + freq[i][1]);
        }
    }
}
