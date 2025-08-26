import java.util.*;

public class Passwordtool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of passwords: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] passwords = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter password " + (i + 1) + ": ");
            passwords[i] = sc.nextLine();
        }

        System.out.printf("%-15s %-5s %-5s %-5s %-5s %-5s %-10s %-10s\n",
                "Password", "Len", "U", "L", "D", "S", "Score", "Strength");

        for (String pwd : passwords) {
            int[] counts = analyzePassword(pwd);
            int score = calculateStrength(pwd, counts);
            String strength = (score > 50) ? "Strong" : (score >= 21 ? "Medium" : "Weak");

            System.out.printf("%-15s %-5d %-5d %-5d %-5d %-5d %-10d %-10s\n",
                    pwd, pwd.length(), counts[0], counts[1], counts[2],
                    counts[3], score, strength);
        }

        System.out.print("\nGenerate strong password (length)? ");
        int len = sc.nextInt();
        System.out.println("Generated Password: " + generateStrongPassword(len));

        sc.close();
    }

    public static int[] analyzePassword(String pwd) {
        int upper = 0, lower = 0, digit = 0, special = 0;
        for (char c : pwd.toCharArray()) {
            if (c >= 65 && c <= 90) upper++;
            else if (c >= 97 && c <= 122) lower++;
            else if (c >= 48 && c <= 57) digit++;
            else if (c >= 33 && c <= 126) special++;
        }
        return new int[]{upper, lower, digit, special};
    }

    public static int calculateStrength(String pwd, int[] counts) {
        int score = (pwd.length() > 8) ? (pwd.length() - 8) * 2 : 0;
        for (int count : counts) {
            if (count > 0) score += 10;
        }
        if (pwd.toLowerCase().contains("123") || pwd.toLowerCase().contains("abc"))
            score -= 10;
        return score;
    }

    public static String generateStrongPassword(int length) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%^&*()";
        String all = upper + lower + digits + special;

        StringBuilder pwd = new StringBuilder();
        Random rand = new Random();

        // Ensure at least one of each type
        pwd.append(upper.charAt(rand.nextInt(upper.length())));
        pwd.append(lower.charAt(rand.nextInt(lower.length())));
        pwd.append(digits.charAt(rand.nextInt(digits.length())));
        pwd.append(special.charAt(rand.nextInt(special.length())));

        // Fill remaining with random characters
        while (pwd.length() < length) {
            pwd.append(all.charAt(rand.nextInt(all.length())));
        }

        return shuffle(pwd.toString());
    }

    public static String shuffle(String input) {
        List<Character> chars = new ArrayList<>();
        for (char c : input.toCharArray()) chars.add(c);
        Collections.shuffle(chars);
        StringBuilder sb = new StringBuilder();
        for (char c : chars) sb.append(c);
        return sb.toString();
    }
}
