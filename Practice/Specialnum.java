import java.util.Scanner;
public class Specialnum
{
public static void main(String args[])
{
System.out.println("Enter a two digit number");
Scanner input=new Scanner(System.in);
int num=input.nextInt();
int c=0,temp=num,z=num,cal=0,cal1=0,calfinal=0;
while(num>0)
{
int d=num%10;
c++;
num=num/10;
System.out.println(c);
}
if(c==2)
{
while(temp>0)
{
int r=temp%10;
cal=cal+r;
cal1=cal*r;
temp=temp/10;
}
calfinal=cal+cal1;
}
if(calfinal==z)
{
System.out.println("number is a special two digit number");
}
else
{
System.out.println("number is not a special two digit number");
}
input.close();
}
}