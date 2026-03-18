/* 3. Aim of the program - Define an interface Emploee with a method getDetails() to get emplyee details as Empid and Ename. Also define a derived interface Manager with a method getDeptDetails() to get department details such as Deptid and Deptname.Then define a class Head which implements Manager interface and also prints all details of the employee. Write the complete program to display all details of one head of the department.
            Input - Enter employee id - 123
              Enter employee name - Sidharth Ambani
              Enter department id - 06
              Enter department name -Marketing
              Output - Employee id - 123
                  Employee name - Sidharth Ambani
                  Department id - 06
                  Department name -Marketing */

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
