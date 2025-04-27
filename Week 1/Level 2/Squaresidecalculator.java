import java.util.Scanner;
public class Squaresidecalculator 
{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the perimeter of the square: ");
double perimeter = scanner.nextDouble();
double sideLength = perimeter / 4;
System.out.printf("The length of the side is %.2f units, whose perimeter is %.2f units.%n", sideLength, perimeter);
scanner.close();
}
}
