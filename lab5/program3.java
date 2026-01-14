import java.util.Scanner;

interface Employee {
    void getDetails();  
}

interface Manager extends Employee {
    void getDeptDetails();  
}

class Head implements Manager {
    int empId;
    String empName;
    int deptId;
    String deptName;

    Scanner sc = new Scanner(System.in);

    public void getDetails() {
        System.out.print("Enter employee id: ");
        empId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter employee name: ");
        empName = sc.nextLine();
    }

    public void getDeptDetails() {
        System.out.print("Enter department id: ");
        deptId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter department name: ");
        deptName = sc.nextLine();
    }

    public void displayAllDetails() {
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + empName);
        System.out.println("Department id - " + deptId);
        System.out.println("Department name -" + deptName);
    }
}

public class program3 {
    public static void main(String[] args) {
        Head head = new Head();
        head.getDetails();
        head.getDeptDetails();
        head.displayAllDetails();
    }
}
