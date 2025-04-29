import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = getDigitsArray(number, count);
        int[] reversed = reverseArray(digits);

        System.out.println("Palindrome: " + Arrays.equals(digits, reversed));
        System.out.println("Duck Number: " + isDuckNumber(digits));
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

    static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }
}
