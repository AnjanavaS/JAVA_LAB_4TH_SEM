/* 2. Aim of the program -Define an interface with three methods – earnings(), deductions() and bonus() and define a Java class ‘Manager’ which uses this interface without implementing bonus() method. Also define another Java class ‘Substaff’ which extends from ‘Manager’ class and implements bonus() method.  Write the complete program to find out earnings, deduction and bonus of a sbstaff with basic salary amount entered by the user as per the following guidelines –
earnings           basic + DA (80% of basic) + HRA (15% of basic)
deduction PF       12% of basic
bonus             50% of basic
   Input -Basic salary - 50000
   Output -Earnings -  97500
Deduction -6000
Bonus - 25000 */

import java.util.Scanner;

interface Employee {
    void earnings(double basic);
    void deductions(double basic);
    void bonus(double basic);
}

abstract class Manager implements Employee {
    public void earnings(double basic) {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        double totalEarnings = basic + da + hra;
        System.out.println("Earnings - " + (int)totalEarnings);
    }

    public void deductions(double basic) {
        double pf = 0.12 * basic;
        System.out.println("Deduction - " + (int)pf);
    }
}

class Substaff extends Manager {
    public void bonus(double basic) {
        double b = 0.5 * basic;
        System.out.println("Bonus - " + (int)b);
    }
}

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        Substaff sb = new Substaff();
        sb.earnings(basic);
        sb.deductions(basic);
        sb.bonus(basic);
    }
}
