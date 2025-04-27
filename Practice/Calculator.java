import java.util.Scanner;
public class Calculator 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter first number: ");
double number1 = scanner.nextDouble();
System.out.print("Enter second number: ");
double number2 = scanner.nextDouble();
System.out.println("The addition, subtraction, multiplication, and division values of " + number1 + " and " + number2 + " are: ");
System.out.println("Addition: " + (number1 + number2));
System.out.println("Subtraction: " + (number1 - number2));
System.out.println("Multiplication: " + (number1 * number2));
if (number2 != 0) {
System.out.println("Division: " + (number1 / number2));
} 
else 
{
System.out.println("Division: Cannot divide by zero");
}
scanner.close();
}
}
