import java.util.Scanner;
public class Weightconversion
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.print("Enter the weight in pounds: ");
double weightPounds = input.nextDouble();
double weightKg = weightPounds/2.2;
System.out.println("The weight of the person in pounds is " + weightPounds + " and in kg is " + weightKg);
}
}