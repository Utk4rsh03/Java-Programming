import java.util.Scanner;
public class Arraysum
{
public static void main(String args[])
{
System.out.println("Enter Values for the Array");
Scanner input=new Scanner(System.in);
double arr[]=new double[10];
double total=0.0;
int i=0;
while(true){
	System.out.println("Enter the number:");
	double num=input.nextDouble();
	
	if(num<=0){
		break;
	}else{
		arr[i]=num;
		i++;
		}	
}
for(int j=0;j<arr.length;j++){
total=total+arr[j];
}
System.out.println("The Sum of all the Array elements = "+total);
input.close();
}
}