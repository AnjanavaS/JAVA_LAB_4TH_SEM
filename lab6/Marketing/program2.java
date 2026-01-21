package Marketing;

import General.Employee;
import java.util.Scanner;

public class program2 extends Employee {

    public program2(int empid, String ename, double basic) {
        super(empid, ename, basic);
    }

    public double tallowance() {
        return 0.05 * earnings();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the employee id and employee name");
        int id = sc.nextInt();
        String name = sc.next();

        System.out.println("Enter the basic salary");
        double basic = sc.nextDouble();

        program2 s = new program2(id, name, basic);

        System.out.println("The emp id of the employee is " + s.empid);
        System.out.println("The total earning is " + s.earnings());
    }
}
