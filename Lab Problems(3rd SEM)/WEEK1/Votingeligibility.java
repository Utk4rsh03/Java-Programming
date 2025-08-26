import java.util.Random;
import java.util.Scanner;

public class Votingeligibility {

    // Generate random ages between 10 and 99
    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // 10–99
        }
        return ages;
    }

    // Check eligibility for each age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);
            if (age >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }

    // Display results
    public static void displayResults(String[][] data) {
        System.out.println("\n--- Voting Eligibility Report ---");
        System.out.println("+-----+-----------+");
        System.out.println("| Age | Can Vote? |");
        System.out.println("+-----+-----------+");
        for (String[] row : data) {
            System.out.printf("| %-3s | %-9s |\n", row[0], row[1]);
        }
        System.out.println("+-----+-----------+");
    }

    // Main program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;

        System.out.println("Enter ages of 10 students (or type 'R' to generate random ages):");
        String input = scanner.nextLine();
        int[] ages = new int[n];

        if (input.equalsIgnoreCase("R")) {
            ages = generateRandomAges(n);
            System.out.print("Randomly generated ages: ");
            for (int age : ages) {
                System.out.print(age + " ");
            }
            System.out.println();
        } else {
            String[] parts = input.split("\\s+");
            if (parts.length != n) {
                System.out.println("Invalid input. Please enter exactly 10 ages separated by space.");
                scanner.close();
                return;
            }
            for (int i = 0; i < n; i++) {
                try {
                    ages[i] = Integer.parseInt(parts[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter valid integers for ages.");
                    scanner.close();
                    return;
                }
            }
        }

        String[][] eligibility = checkVotingEligibility(ages);
        displayResults(eligibility);

        scanner.close();
    }
}
