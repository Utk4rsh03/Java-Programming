import java.util.Scanner;
public class ArraymultiplicationOne
{
public static void main(String args[])
{
System.out.println("Enter a Number Between 6 to 9 to print the Table:");
Scanner input=new Scanner(System.in);
int num=input.nextInt();
int arr[]=new int[10];
if(num>=6 && num<=9)
{
for(int i=1;i<=10;i++)
{
arr[i-1]=num*i;
}
System.out.println("Multiplication Table of " + num + ":");
for (int i =1;i <=10;i++)
{
System.out.println(num + " * " + i + " = " + arr[i-1]);
}
}
else
{
System.out.println("Entered Number is not in the Given Range");
}
input.close();
}
}