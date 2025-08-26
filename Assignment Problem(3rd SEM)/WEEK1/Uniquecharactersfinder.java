import java.util.Scanner;
class Uniquecharactersfinder {
public static int myLength(String text) {
int count = 0;
try {
while (true) {
text.charAt(count);
count++;
}
} catch (IndexOutOfBoundsException e) {}
return count;
}
public static char[] findUniqueChars(String text) {
int len = myLength(text);
char[] unique = new char[len];
int uniqueCount = 0;
for (int i = 0; i < len; i++) {
char c = text.charAt(i);
boolean isUnique = true;
for (int j = 0; j < i; j++) {
if (text.charAt(j) == c) {
isUnique = false;
break;
}
}
if (isUnique) {
unique[uniqueCount++] = c;
}
}
char[] result = new char[uniqueCount];
System.arraycopy(unique, 0, result, 0, uniqueCount);
return result;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter text: ");
String text = sc.nextLine();
char[] uniques = findUniqueChars(text);
System.out.print("Unique characters: ");
for (char c : uniques) {
System.out.print(c + " ");
}
}
}
