import java.util.Scanner;
public class Chocolates
{
public static void main(String args[])
{
int numberOfChocolates,numberOfChildren;
Scanner input=new Scanner(System.in);
System.out.print("Enter the number of chocolates: ");
numberOfChocolates = input.nextInt();
System.out.print("Enter the number of children: ");
numberOfChildren = input.nextInt();
int chocolatesPerChild = numberOfChocolates / numberOfChildren;
int remainingChocolates = numberOfChocolates % numberOfChildren;
System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
}
}