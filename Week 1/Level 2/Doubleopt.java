import java.util.Scanner;
public class Doubleopt 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the value of a: ");
double a = scanner.nextDouble();
System.out.print("Enter the value of b: ");
double b = scanner.nextDouble();
System.out.print("Enter the value of c: ");
double c = scanner.nextDouble();
double result1 = a + b * c;
double result2 = a * b + c;
double result3 = c + a / b;
double result4 = a % b + c;
System.out.printf("The results of the double operations are: %.2f, %.2f, %.2f, and %.2f.%n",result1, result2, result3, result4);
scanner.close();
}
}