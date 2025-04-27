import java.util.Scanner;
public class Kmtomilesconverter 
{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double km;
System.out.print("Enter distance in kilometers: ");
km = input.nextDouble(); 
double miles = km / 1.6;
System.out.println(km + " kilometers is equal to " + miles + " miles.");
input.close();
}
}
