import java.util.Scanner;
public class Handshake
{
public static int Calculate(int n)
{
return (n*(n - 1))/2;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number of students to calculate maximum number of handshakes");
int num=sc.nextInt();
int max=Calculate(num);
System.out.println("maximum number of handshakes for "+num+" students = "+max);
}
} 