import java.util.Scanner;
public class Travelcomputation
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
System.out.print("Enter the name of the traveler: ");
String name = input.nextLine();
System.out.print("Enter the city from where traveling: ");
String fromCity = input.nextLine();
System.out.print("Enter the via city: ");
String viaCity = input.nextLine();
System.out.print("Enter the final destination city: ");
String toCity = input.nextLine();
System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
double distanceFromToVia = input.nextDouble();
System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " in minutes: ");
int timeFromToVia = input.nextInt();
System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
double distanceViaToFinalCity = input.nextDouble();
System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " in minutes: ");
int timeViaToFinalCity = input.nextInt();
double totalDistance = distanceFromToVia + distanceViaToFinalCity;
int totalTime = timeFromToVia + timeViaToFinalCity;
System.out.println(name + " is traveling from " + fromCity + " to " + toCity + " via " + viaCity);
System.out.println("Total Distance: " + totalDistance + " miles");
System.out.println("Total Travel Time: " + totalTime + " minutes");
System.out.print("Enter the fee amount: ");
int fee = input.nextInt();
System.out.print("Enter the discount percentage: ");
int discountPercent = input.nextInt();
int discountedAmount = (fee * discountPercent) / 100;
int finalAmount = fee - discountedAmount;
int additionalCharge = finalAmount + 50;
System.out.println("The results of Int Operations are " + discountedAmount + ", " + finalAmount + ", and " + additionalCharge);
}
}