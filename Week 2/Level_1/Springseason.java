public class Springseason 
{
public static void main(String[] args) 
{
int month = Integer.parseInt(args[0]);
int day = Integer.parseInt(args[1]);
if ((month == 3 && day >= 20 && day <=31) || (month == 4 && day<=30) || (month == 5 && day<=31) || (month == 6 && day <= 20 && day<=30)) 
{
System.out.println("It's a Spring Season");
} 
else 
{
System.out.println("Not a Spring Season");
}
}
}
