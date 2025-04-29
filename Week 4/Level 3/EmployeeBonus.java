import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        double bonus;

        if (salary < 10000)
            bonus = 0.10 * salary;
        else if (salary <= 50000)
            bonus = 0.07 * salary;
        else
            bonus = 0.05 * salary;

        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Pay: " + (salary + bonus));
    }
}
