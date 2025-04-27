import java.util.Scanner;
public class Distanceconverter 

{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the distance in feet: ");
double distanceInFeet = scanner.nextDouble();
double distanceInYards = distanceInFeet / 3;
double distanceInMiles = distanceInFeet / (3 * 1760);
System.out.printf("The distance is %.2f yards or %.4f miles.%n", distanceInYards,distanceInMiles);
scanner.close();
}
}