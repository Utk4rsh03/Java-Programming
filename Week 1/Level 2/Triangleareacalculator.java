import java.util.Scanner;
public class Triangleareacalculator 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter base of the triangle in inches: ");
double base = scanner.nextDouble();
System.out.print("Enter height of the triangle in inches: ");
double height = scanner.nextDouble();
double areaInInches = 0.5 * base * height;
double heightInCm = height * 2.54;
double heightInFeet = height / 12;
double heightInInches = height;
System.out.println("Your Height in cm is " + heightInCm + " while in feet is " +
heightInFeet + " and inches is " + heightInInches);
scanner.close();
}
}