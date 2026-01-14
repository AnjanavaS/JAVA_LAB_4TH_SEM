import java.util.Scanner;

class Account
{
    int acc_no;
    double balance;

    void input(Scanner sc)
    {
        System.out.print("Enter Account No: ");
        acc_no = sc.nextInt();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void disp()
    {
        System.out.println("Account No: " + acc_no);
        System.out.println("Balance   : " + balance);
    }
}

class Person extends Account
{
    String name;
    long aadhar_no;

    void input(Scanner sc)
    {
        System.out.print("Enter Name: ");
        name = sc.next();

        System.out.print("Enter Aadhar No: ");
        aadhar_no = sc.nextLong();

        super.input(sc);
    }

    void disp()
    {
        System.out.println("Name      : " + name);
        System.out.println("Aadhar No : " + aadhar_no);
        super.disp();
    }
}

class program3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Person p[] = new Person[3];

        for (int i = 0; i < 3; i++)
        {
            System.out.println("\nEnter details of person " + (i + 1));
            p[i] = new Person();
            p[i].input(sc);
        }

        System.out.println("\n--- Person Details ---");
        for (int i = 0; i < 3; i++)
        {
            System.out.println("\nPerson " + (i + 1));
            p[i].disp();
        }
    }
}
