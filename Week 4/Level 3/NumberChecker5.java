import java.util.Scanner;

public class NumberChecker5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] factors = findFactors(number);
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Cube Product of Factors: " + productOfCubes(factors));
        System.out.println("Perfect Number: " + isPerfect(number, factors));
        System.out.println("Abundant Number: " + isAbundant(number, factors));
        System.out.println("Deficient Number: " + isDeficient(number, factors));
        System.out.println("Strong Number: " + isStrong(number));
    }

    static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[index++] = i;
        return factors;
    }

    static int greatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int f : factors) if (f > max) max = f;
        return max;
    }

    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    static int productOfFactors(int[] factors) {
        int product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    static double productOfCubes(int[] factors) {
        double product = 1;
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }

    static boolean isPerfect(int n, int[] factors) {
        int sum = 0;
        for (int f : factors) if (f != n) sum += f;
        return sum == n;
    }

    static boolean isAbundant(int n, int[] factors) {
        int sum = 0;
        for (int f : factors) if (f != n) sum += f;
        return sum > n;
    }

    static boolean isDeficient(int n, int[] factors) {
        int sum = 0;
        for (int f : factors) if (f != n) sum += f;
        return sum < n;
    }

    static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }

    static int factorial(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }
}
