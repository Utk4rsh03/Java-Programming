import java.util.Scanner;
public class Sumuntilzero 
{
public static void main(String[] args) 
{
Scanner scanner=new Scanner(System.in);
double total = 0.0; 
double number;     
System.out.println("Enter a number,0 to total: ");
number = scanner.nextDouble();
while (number != 0) 
{
total += number; 
System.out.println("Enter another number,0 to total: ");
number = scanner.nextDouble();
}
System.out.println("The total sum is: " + total);
scanner.close();
}
}
