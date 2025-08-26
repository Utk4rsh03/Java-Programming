import java.util.*;

public class Spellchecker {
    public static void main(String[] args) {
        String dictionary[] = {"java", "programming", "is", "fun", "challenging"};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase();

        String[] words = extractWords(sentence);

        System.out.printf("%-15s %-15s %-10s %-10s\n",
                "Original", "Suggestion", "Distance", "Status");

        for (String word : words) {
            String suggestion = findClosestWord(word, dictionary);
            int distance = stringDistance(word, suggestion);

            if (distance == 0)
                System.out.printf("%-15s %-15s %-10d %-10s\n", word, "-", distance, "Correct");
            else if (distance <= 2)
                System.out.printf("%-15s %-15s %-10d %-10s\n", word, suggestion, distance, "Misspelled");
            else
                System.out.printf("%-15s %-15s %-10d %-10s\n", word, "-", distance, "Unknown");
        }

        sc.close();
    }

    public static String[] extractWords(String text) {
        ArrayList<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                word.append(c);
            } else if (word.length() > 0) {
                words.add(word.toString());
                word.setLength(0);
            }
        }
        if (word.length() > 0) words.add(word.toString());
        return words.toArray(new String[0]);
    }

    // Simple distance: counts mismatches + length diff
    public static int stringDistance(String a, String b) {
        int len = Math.max(a.length(), b.length());
        int dist = Math.abs(a.length() - b.length());
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            if (a.charAt(i) != b.charAt(i)) dist++;
        }
        return dist;
    }

    public static String findClosestWord(String word, String[] dictionary) {
        int minDist = Integer.MAX_VALUE;
        String closest = word;
        for (String dictWord : dictionary) {
            int dist = stringDistance(word, dictWord);
            if (dist < minDist) {
                minDist = dist;
                closest = dictWord;
            }
        }
        return closest;
    }
}
