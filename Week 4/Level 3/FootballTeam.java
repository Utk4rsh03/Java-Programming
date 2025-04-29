import java.util.Random;

public class FootballTeam {

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        int sum = findSum(heights);
        double mean = findMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Heights: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println("\nShortest Height: " + shortest);
        System.out.println("Tallest Height: " + tallest);
        System.out.println("Mean Height: " + mean);
    }

    static int findSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    static double findMean(int sum, int n) {
        return (double) sum / n;
    }

    static int findShortest(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    static int findTallest(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
