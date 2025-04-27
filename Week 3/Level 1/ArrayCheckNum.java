import java.util.Scanner;
public class ArrayCheckNum
{
public static void main(String args[])
{
System.out.println("Enter 5 Numbers");
int arr[]=new int[5];
Scanner input=new Scanner(System.in);
for(int i=0;i<5;i++)
{
arr[i]=input.nextInt();
}
for(int i=0;i<5;i++)
{
if(arr[i]>0)
{
if(arr[i]%2==0)
{
System.out.println(arr[i]+" is positive and also number is Even Number");
}
else
{
System.out.println(arr[i]+" is positive and also number is odd Number");
}
}
else if(arr[i]<0)
{
System.out.println(arr[i]+" is Negative Number");
}
else
{
System.out.println(arr[i]+" is Zero");
}
}
if(arr[0]>arr[4])
{
	System.out.println("First Number "+arr[0]+" is greater than Last Number "+arr[4]);
}
else if(arr[0]<arr[4])
{
	System.out.println("First Number "+arr[0]+" is less than Last Number "+arr[4]);
}
else
{
	System.out.println("First Number "+arr[0]+" and Last Number "+arr[4]+"	are Equal");
}
input.close();
}
}