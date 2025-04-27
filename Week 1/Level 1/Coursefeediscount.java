public class Coursefeediscount 
{
public static void main(String[] args) 
{
double fee = 125000;
double discountPercent = 10;
double discount = (fee * discountPercent) / 100;
double finalFee = fee - discount;
System.out.println("Discount amount: INR " + discount);
System.out.println("Final discounted fee is: INR " + finalFee);
}
}
