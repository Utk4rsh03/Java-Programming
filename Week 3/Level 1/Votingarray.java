import java.util.Scanner;
public class Votingarray
{
public static void main(String args[])
{
System.out.println("Enter Age of 10 Students");
int arr[]=new int[10];
Scanner input=new Scanner(System.in);
for(int i=0;i<10;i++)
{
arr[i]=input.nextInt();
}
for(int i=0;i<10;i++)
{
if(arr[i]>=18)
{
System.out.println("Student with the age "+arr[i]+" can vote");
}
else
{
System.out.println("Student with the age "+arr[i]+" can not vote");
}
}
input.close();
}
}