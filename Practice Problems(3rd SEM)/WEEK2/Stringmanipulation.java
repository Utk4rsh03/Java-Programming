import java.util.*;

public class Stringmanipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        String trimmed = input.trim();
        String replacedSpaces = trimmed.replace(" ", "_");
        String noDigits = replacedSpaces.replaceAll("\\d", "");
        String[] words = noDigits.split("_");
        String joined = String.join(" | ", words);

        System.out.println("Trimmed: " + trimmed);
        System.out.println("Spaces replaced: " + replacedSpaces);
        System.out.println("Digits removed: " + noDigits);
        System.out.println("Joined with '|': " + joined);
        System.out.println("No punctuation: " + removePunctuation(trimmed));
        System.out.println("Capitalized: " + capitalizeWords(trimmed));
        System.out.println("Reversed order: " + reverseWordOrder(trimmed));
        System.out.println("Word frequency:");
        countWordFrequency(trimmed);

        scanner.close();
    }

    public static String removePunctuation(String text) {
        return text.replaceAll("\\p{Punct}", "");
    }

    public static String capitalizeWords(String text) {
        String[] words = text.toLowerCase().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (w.length() > 0) {
                sb.append(Character.toUpperCase(w.charAt(0)))
                  .append(w.substring(1))
                  .append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static String reverseWordOrder(String text) {
        String[] words = text.split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public static void countWordFrequency(String text) {
        String[] words = text.toLowerCase().split("\\s+");
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }
        freq.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
