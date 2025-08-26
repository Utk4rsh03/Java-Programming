import java.util.Scanner;

public class ASCIIprocessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        for (char ch : text.toCharArray()) {
            System.out.println("Char: '" + ch + "' ASCII: " + (int) ch + " Type: " + classifyCharacter(ch));

            if (Character.isLetter(ch)) {
                System.out.println(" Uppercase: " +
                        Character.toUpperCase(ch) + " (" + (int) Character.toUpperCase(ch) + ")");
                System.out.println(" Lowercase: " +
                        Character.toLowerCase(ch) + " (" + (int) Character.toLowerCase(ch) + ")");
                System.out.println(" Difference: " +
                        (Character.toUpperCase(ch) - Character.toLowerCase(ch)));
            }
            System.out.println();
        }

        System.out.println("Caesar cipher (+3): " + caesarCipher(text, 3));

        scanner.close();
    }

    public static String classifyCharacter(char ch) {
        if (Character.isUpperCase(ch)) return "Uppercase Letter";
        if (Character.isLowerCase(ch)) return "Lowercase Letter";
        if (Character.isDigit(ch)) return "Digit";
        return "Special Character";
    }

    public static char toggleCase(char ch) {
        if (Character.isUpperCase(ch)) return (char) (ch + 32);
        if (Character.isLowerCase(ch)) return (char) (ch - 32);
        return ch;
    }

    public static String caesarCipher(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char c = (char) ((ch - base + shift) % 26 + base);
                result.append(c);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
