import java.util.*;
public class Textcompressor {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter text: ");
String text = sc.nextLine();
char[] chars = new char[text.length()];
int[] freq = new int[256]; // ASCII
for (int i = 0; i < text.length(); i++) {
freq[text.charAt(i)]++;
chars[i] = text.charAt(i);
}
System.out.println("Character Frequency Table:");
for (int i = 0; i < 256; i++) {
if (freq[i] > 0) {
System.out.println("'" + (char)i + "': " + freq[i]);
}
}
Set<Character> seen = new HashSet<>();
StringBuilder compressed = new StringBuilder();
for (char c : chars) {
if (!seen.contains(c)) {
compressed.append(c);
seen.add(c);
}
}
System.out.println("Original: " + text);
System.out.println("Compressed: " + compressed);
System.out.printf("Compression ratio: %.2f%%\n",
(1.0 * compressed.length() / text.length()) * 100);
sc.close();
}
}