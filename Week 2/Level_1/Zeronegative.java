import java.util.Scanner;
public class Zeronegative 
{
public static void main(String[] args) 
{
Scanner scanner=new Scanner(System.in);
double total = 0.0; 
double number;     
System.out.println("Enter a number,0 or negative to total: ");
number = scanner.nextDouble();
while(true) 
{
total=total+number; 
System.out.println("Enter another number,0 or negative to total: ");
number = scanner.nextDouble();
if(number<=0)
{
break;
}
}
System.out.println("The total sum is: " + total);
scanner.close();
}
}
