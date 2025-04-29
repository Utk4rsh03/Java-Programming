import java.util.Scanner;
public class Simpleinterest
{
public static double Calculateinterest(double p,double r,double t)
{
return (p*r*t)/100;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter principle, rate and time");
double p=sc.nextDouble();
double r=sc.nextDouble();
double t=sc.nextDouble();
double si=Calculateinterest(p,r,t);
System.out.println("simple interest for given values is "+si);
}
}