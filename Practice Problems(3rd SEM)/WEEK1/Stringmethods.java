import java.util.Scanner;

public class Stringmethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your favorite programming language: ");
        String favLang = scanner.nextLine();

        System.out.print("Enter a sentence about your programming experience: ");
        String sentence = scanner.nextLine();

        // Splitting name into parts
        String[] nameParts = fullName.trim().split("\\s+");
        String firstName = nameParts[0];
        String lastName = nameParts.length > 1 ? nameParts[nameParts.length - 1] : "";

        // Count characters excluding spaces
        int charCount = sentence.replace(" ", "").length();

        // Convert favorite language to uppercase
        String langUpper = favLang.toUpperCase();

        // Display summary
        System.out.println("\nSummary:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Programming Language: " + langUpper);
        System.out.println("Characters in sentence (excluding spaces): " + charCount);

        scanner.close();
    }
}
