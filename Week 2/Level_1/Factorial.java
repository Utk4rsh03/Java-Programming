import java.util.Scanner;
public class Factorial
{
public static void main(String args[])
{
System.out.println("Enter your number for Factorial:");
int fact=1;
Scanner input=new Scanner(System.in);
int number=input.nextInt();
while(number>0)
{
fact=fact*number;
number--;
}
System.out.println("Factorial of the entered Numberis = "+fact);
input.close();
}
}