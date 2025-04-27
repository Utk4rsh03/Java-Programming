import java.util.Scanner;
public class Multiplicationable
{
public static void main(String args[])
{
System.out.println("Enter your number between 6 to 9");
Scanner input=new Scanner(System.in);
int number=input.nextInt();
if(number>=6 && number<=9)
{
for(int i=1;i<=10;i++)
{ 
double mult=number*i;
System.out.println(number+" * " +i+" = "+mult);
mult=0;
}
}
else
{
System.out.println("Number is not in the given Range");
}
input.close();
}
}