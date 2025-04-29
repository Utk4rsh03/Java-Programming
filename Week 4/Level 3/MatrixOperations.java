import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];

        System.out.println("Enter matrix A:");
        for (int i = 0; i < 2; i++) for (int j = 0; j < 2; j++) a[i][j] = sc.nextInt();

        System.out.println("Enter matrix B:");
        for (int i = 0; i < 2; i++) for (int j = 0; j < 2; j++) b[i][j] = sc.nextInt();

        System.out.println("Addition:");
        printMatrix(add(a, b));

        System.out.println("Multiplication:");
        printMatrix(multiply(a, b));

        System.out.println("Transpose of A:");
        printMatrix(transpose(a));
    }

    static int[][] add(int[][] a, int[][] b) {
        int[][] res = new int[2][2];
        for (int i = 0; i < 2; i++) for (int j = 0; j < 2; j++) res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    static int[][] multiply(int[][] a, int[][] b) {
        int[][] res = new int[2][2];
        for (int i = 0; i < 2; i++) for (int j = 0; j < 2; j++) {
            res[i][j] = 0;
            for (int k = 0; k < 2; k++) res[i][j] += a[i][k] * b[k][j];
        }
        return res;
    }

    static int[][] transpose(int[][] m) {
        int[][] res = new int[2][2];
        for (int i = 0; i < 2; i++) for (int j = 0; j < 2; j++) res[i][j] = m[j][i];
        return res;
    }

    static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
