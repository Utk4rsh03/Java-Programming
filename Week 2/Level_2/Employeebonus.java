import java.util.Scanner;
public class Employeebonus
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter your salary");
double salary= input.nextDouble();
System.out.println("Enter your year of service");
double yearservice=input.nextDouble();
if(yearservice>5)
{
double bonus=(5*salary)/100;
System.out.println("Bonus amount="+bonus);
}
else
{
System.out.println("No bonus");
}
input.close();
}
}