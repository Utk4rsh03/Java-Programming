import java.util.Scanner;
public class Coursefeeuserinput 
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the Course Fee (INR): ");
double fee = scanner.nextDouble();
System.out.print("Enter the Discount Percentage: ");
double discountPercent = scanner.nextDouble();
double discount = (fee * discountPercent) / 100;
double finalFee = fee - discount;
System.out.println("\n Fee Details");
System.out.println("Original Course Fee: INR " + fee);
System.out.println("Discount Amount: INR " + discount);
System.out.println("Final Fee after Discount: INR " + finalFee);
scanner.close();
}
}