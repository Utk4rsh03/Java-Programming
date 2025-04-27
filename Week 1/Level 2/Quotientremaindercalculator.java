import java.util.Scanner;
public class Quotientremaindercalculator 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the first number: ");
int number1 = scanner.nextInt();
System.out.print("Enter the second number: ");
int number2 = scanner.nextInt();
if (number2 != 0) {
int quotient = number1 / number2;
int remainder = number1 % number2;
System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d.%n",quotient, remainder, number1, number2);
} 
else 
{
System.out.println("Division by zero is not allowed.");
}
scanner.close();
}
}