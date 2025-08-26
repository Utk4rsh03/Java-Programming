import java.util.Scanner;

public class Vowelconsonantanalyzer {

    // Check type of a character
    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch); // convert to lowercase if letter

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Analyze each character of string
    public static String[][] analyzeString(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            result[i][0] = String.valueOf(currentChar); // The character itself
            result[i][1] = checkCharacterType(currentChar); // Character type
        }
        return result;
    }

    // Display results in a formatted table
    public static void displayResults(String[][] analysis) {
        System.out.println("\n");
        System.out.println("             CHARACTER ANALYSIS REPORT");
        System.out.println(" ");
        System.out.println("+-----+-----+");
        System.out.println("| Character  | Type            |");
        System.out.println("+-----+-----+");

        for (String[] row : analysis) {
            String character = row[0];
            String type = row[1];

            // Replace special chars with labels
            switch (character) {
                case " ":
                    character = "[Space]";
                    break;
                case "\t":
                    character = "[Tab]";
                    break;
                case "\n":
                    character = "[Newline]";
                    break;
            }

            System.out.printf("| %-10s | %-15s |\n", character, type);
        }

        System.out.println("+------------+-----------------+");
        displayStatistics(analysis);
    }

    // Display summary statistics
    public static void displayStatistics(String[][] analysis) {
        int vowels = 0, consonants = 0, nonLetters = 0;

        for (String[] row : analysis) {
            switch (row[1]) {
                case "Vowel":
                    vowels++;
                    break;
                case "Consonant":
                    consonants++;
                    break;
                case "Not a Letter":
                    nonLetters++;
                    break;
            }
        }

        System.out.println("\n=== STATISTICS ===");
        System.out.println("Total characters : " + analysis.length);
        System.out.println("Vowels           : " + vowels);
        System.out.println("Consonants       : " + consonants);
        System.out.println("Non-letters      : " + nonLetters);
        System.out.printf("Letter percentage: %.1f%%\n",
                (vowels + consonants) * 100.0 / analysis.length);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Vowel and Consonant Analyzer ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("No input provided!");
            scanner.close();
            return;
        }

        String[][] analysis = analyzeString(input);
        displayResults(analysis);

        scanner.close();
    }
}
