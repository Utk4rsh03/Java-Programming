import java.util.Scanner;
public class Oddeven
{
public static void main(String args[])
{
System.out.println("Enter your number: ");
Scanner input=new Scanner(System.in);
int number=input.nextInt();
System.out.println("Even numbers are: ");
for(int i=1;i<=number;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
System.out.println("Odd numbers are: ");
for(int i=1;i<=number;i++)
{
	if(i%2!=0)
	{
	 System.out.println(i);
	}
}
input.close();
}
}