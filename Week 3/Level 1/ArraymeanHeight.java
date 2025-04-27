import java.util.Scanner;
public class ArraymeanHeight
{
public static void main(String args[])
{
System.out.println("Enter The height of the 11 Players in cm");
Scanner input=new Scanner(System.in);
double heights[]=new double[11];
double mean=0.0;
double sum=0.0;
for(int i=0; i<11;i++)
{
heights[i]=input.nextDouble();
}
for(int i=0;i<11;i++)
{
if (heights[i] <= 0)
{
System.out.println("Invalid height entered! Please enter positive values.");
input.close();
return;
}
sum =sum+heights[i];
}
mean = sum / 11;
System.out.println("Mean Height of the players is: " + mean + " cm");
input.close();
}
}
