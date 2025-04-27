import java.util.Scanner;
public class Naturalsum
{
public static void main(String args[])
{
int sum=0;
Scanner input=new Scanner(System.in);
System.out.println("Enter your Number");
int number=input.nextInt();
if(number>0)
{
for(int i=0;i<=number;i++)
{
sum=sum+i;
}
System.out.println("The sum of "+number+" natural number is "+sum);
}
else
{
System.out.println("The number "+number+ "is not a natural number ");
}
input.close();
}
}