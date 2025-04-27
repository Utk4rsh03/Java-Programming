import java.util.Scanner;
public class swap
{
public static void main(String args[])
{double number1,number2, temp=0;
Scanner input=new Scanner(System.in);
System.out.println("Enter your first Number");
number1=input.nextDouble();
System.out.println("Enter your Second Number");
number2=input.nextDouble();
temp=number1;
number1=number2;
number2=temp;
System.out.println(" The swapped numbers are "+number1+" and "+number2);
}
}