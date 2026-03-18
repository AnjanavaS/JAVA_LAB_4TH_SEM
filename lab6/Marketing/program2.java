/* 2. Define two packages as – General and Marketing. In General package define a class ‘employee’  with data members as empid(protected), ename(private) and a public method as earnings() which calculate total earnings as  
earnings         basic + DA (80% of basic) + HRA (15% of basic)
In Marketing package define a class ‘sales’ which is extending from ‘employee’ class and has a method  tallowance() which calculates Travelling Allowance as 5% of total earning. Write the programs to find out total earning of a sales person for the given basic salary amount and print along with the emp id.
Input:   Enter the employee id and emploee name 123   Amit
Enter the basic salary 1000
Output: The emp id of the employee is 123
The total earning is 1950.0 */

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
