import java.util.Scanner;
public class TemperatureConversion
{
public static void main(String args[])
{
double celsius;
Scanner input=new Scanner(System.in);
System.out.print("Enter the temperature in Celsius for Farenheit conversion: ");
celsius=input.nextDouble();
double convert= (celsius * 9/5) + 32;
System.out.println("The "+celsius+" celsius is "+convert+" farenheit");
}
}