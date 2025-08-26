import java.util.Scanner;

public class Stringlengthfinder {
    public static int findStringLength(String str) {
        int count = 0;
        while (true) {
            try {
                char c = str.charAt(count); // try accessing index
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break; // stop when out of bounds
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.next(); 
        
        int customLength = findStringLength(inputString);
        int builtInLength = inputString.length();

        System.out.println("\n Results ");
        System.out.println("Input string: " + inputString);
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in length(): " + builtInLength);

        if (customLength == builtInLength) {
            System.out.println("✓ Both methods return the same length!");
        } else {
            System.out.println("✗ Methods return different lengths!");
        }

        scanner.close();
    }
}
