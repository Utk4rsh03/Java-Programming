import java.util.Scanner;
public class Naturalsum2
{
public static void main(String args[])
{
System.out.println("Enter your number for sum");
double sum=0.0;
Scanner input=new Scanner(System.in);
double number=input.nextDouble();
while(number>0)
{
sum=sum+number;
number--;
}
double sum2= (number*(number+1))/2;
System.out.println("Sum of "+number+" natural numbers without using formula="+sum);
System.out.println("Sum of "+number+" natural numbers using formula="+sum);
input.close();
}
}