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
