import java.util.Scanner;
class Palindromecheck {
// Logic 1
public static boolean isPalindrome(String text) {
int start = 0, end = text.length() - 1;
while (start < end) {
if (text.charAt(start) != text.charAt(end))
return false;
start++; end--;
}
return true;
}
// Logic 2: Recursive
public static boolean isPalindromeRec(String text, int start, int end)
{
if (start >= end) return true;
if (text.charAt(start) != text.charAt(end)) return false;
return isPalindromeRec(text, start+1, end-1);
}
// Logic 3: Using character arrays
public static boolean isPalindromeCharArray(String text) {
char[] arr = text.toCharArray();
char[] rev = new char[arr.length];
for (int i = arr.length - 1, j = 0; i >= 0; i--, j++)
rev[j] = arr[i];
for (int i = 0; i < arr.length; i++) {
if(arr[i] != rev[i])
return false;
}
return true;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter text: ");
String text = sc.nextLine();
System.out.println("Is palindrome (logic 1): " +
isPalindrome(text));
System.out.println("Is palindrome (logic 2 - recursive): " +
isPalindromeRec(text, 0, text.length()-1));
System.out.println("Is palindrome (logic 3 - array): " +
isPalindromeCharArray(text));
}
}