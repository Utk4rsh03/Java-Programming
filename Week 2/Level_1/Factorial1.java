import java.util.Scanner;
public class Factorial1
{
public static void main(String args[])
{
System.out.println("Enter your number for Factorial:");
int fact=1;
Scanner input=new Scanner(System.in);
int number=input.nextInt();
for(int i=1;i<=number;i++)
{
fact=fact*i;
}
System.out.println("Factorial of the entered Number is = "+fact);
input.close();
}
}