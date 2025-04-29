import java.util.*;

public class RandomStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = 1000 + (int)(Math.random() * 9000);
        return arr;
    }

    public static double[] findAverageMinMax(int[] arr) {
        int min = arr[0], max = arr[0], sum = 0;
        for (int num : arr) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new double[]{sum / (double)arr.length, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.println(Arrays.toString(arr));
        double[] stats = findAverageMinMax(arr);
        System.out.println("Average: " + stats[0] + " Min: " + stats[1] + " Max: " + stats[2]);
    }
}
