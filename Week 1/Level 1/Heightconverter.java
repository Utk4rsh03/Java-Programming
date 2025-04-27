import java.util.Scanner;
public class HeightConverter {
ublic static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter your height in centimeters: ");
double heightCm = input.nextDouble();
double cmPerInch = 2.54;
double inchesPerFoot = 12;
double totalInches = heightCm / cmPerInch;
int feet = (int) (totalInches / inchesPerFoot);
double inches = totalInches % inchesPerFoot;
System.out.println("Your height is: " + feet + " feet " + String.format("%.2f", inches) + " inches.");
input.close();
}
}
