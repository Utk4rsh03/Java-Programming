import java.util.*;
public class Salarybonus
{
public static void main(String args[])
{
double salary,bonus;
Scanner input=new Scanner(System.in);
System.out.println("Enter the Salary");
salary=input.nextDouble();
System.out.println("Enter the Bonus");
bonus=input.nextDouble();
double income=salary+(bonus*salary)/100+salary;
System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+income);
}
}