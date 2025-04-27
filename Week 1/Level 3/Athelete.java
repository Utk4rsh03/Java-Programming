import java.util.Scanner;
public class Athelete
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.print("Enter three sides of the triangular park (in meters): ");
double side1 = input.nextDouble();
double side2 = input.nextDouble();
double side3 = input.nextDouble();
double perimeter = side1 + side2 + side3;
int rounds = (int) Math.ceil(5000 / perimeter);
System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
}
}