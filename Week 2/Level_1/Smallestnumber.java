import java.util.Scanner;
public class Smallestnumber
{
public static void main(String args[])
{
int number1, number2, number3;
Scanner input=new Scanner(System.in);
System.out.println("Enter three numbers");
number1=input.nextInt();
number2=input.nextInt();
number3=input.nextInt();
if(number1<number2 && number1<number3)
{
System.out.println("Is the first number the smallest? YES");
}
else
{
System.out.println("Is the first number the smallest? NO");
}
input.close();
}
}