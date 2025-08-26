import java.util.Scanner;
class Nestedcharfrequency {
public static void printCharFrequency(String text) {
char[] arr = text.toCharArray();
int[] freq = new int[arr.length];
for (int i = 0; i < arr.length; i++) {
freq[i] = 1;
if (arr[i] == '0')
continue;
for (int j = i+1; j < arr.length; j++) {
if(arr[i] == arr[j]) {
freq[i]++;
arr[j] = '0';
}
}
}
System.out.println("Characters and their frequency:");
for (int i = 0; i < arr.length; i++) {
if (arr[i] != '0')
System.out.println(arr[i] + ": " + freq[i]);
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter text: ");
String text = sc.nextLine();
printCharFrequency(text);
}
}