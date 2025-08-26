import java.util.Scanner;

public class Wordsplitter {

    // Split input sentence into words (based on spaces)
    public static String[] splitIntoWords(String text) {
        int wordCount = 0;
        boolean inWord = false;

        // Count words
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (c == ' ') {
                inWord = false;
            }
        }

        // Store words
        String[] words = new String[wordCount];
        int wordIndex = 0;
        int start = -1;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ' && start == -1) {
                start = i; // Start of a new word
            } else if (c == ' ' && start != -1) {
                words[wordIndex++] = text.substring(start, i);
                start = -1;
            }
        }

        // Handle last word if string doesn't end with space
        if (start != -1) {
            words[wordIndex] = text.substring(start);
        }

        return words;
    }

    // Custom string length finder
    public static int findStringLength(String str) {
        int count = 0;
        while (true) {
            try {
                str.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                return count;
            }
        }
    }

    // Create 2D array with words and their lengths
    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            int length = findStringLength(words[i]);
            result[i][1] = String.valueOf(length);
        }
        return result;
    }

    // Display results in a formatted table
    public static void displayResults(String[][] wordLengthArray) {
        System.out.println("\n--- Word Analysis ---");
        System.out.println("+-----+");
        System.out.println("| Word            | Length |");
        System.out.println("+-----+");

        for (String[] row : wordLengthArray) {
            String word = row[0];
            int length = Integer.parseInt(row[1]);
            System.out.printf("| %-15s | %6d |\n", word, length);
        }

        System.out.println("+-----+-----+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputText = scanner.nextLine();

        String[] words = splitIntoWords(inputText);
        String[][] wordLengthArray = createWordLengthArray(words);

        displayResults(wordLengthArray);

        scanner.close();
    }
}
