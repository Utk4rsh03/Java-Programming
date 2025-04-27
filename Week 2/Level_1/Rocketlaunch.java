import java.util.Scanner;
public class Rocketlaunch
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the starting number for the countdown: ");
int counter = scanner.nextInt();
while (counter >= 1) 
{
System.out.println(counter);
counter--;
}
System.out.println("Take Off!");
scanner.close();
}
}
