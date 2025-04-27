import java.util.Scanner;
public class Temperatureconversion1
{
public static void main(String args[])
{
double Farenheit;
Scanner input=new Scanner(System.in);
System.out.print("Enter the temperature in Farenheit for Celsius conversion: ");
Farenheit=input.nextDouble();
double convert= ((Farenheit - 32) * 5)/9;
System.out.println("The "+Farenheit+" Farenheit is "+convert+" celsius");
}
}