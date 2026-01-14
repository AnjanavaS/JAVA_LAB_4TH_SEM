class Account {
    static int accNoGen = 1000;
    int accNo;
    String name;
    double balance;

    Account(String name, double balance) {
        accNo = ++accNoGen;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited Rs " + amt);
    }

    void withdraw(double amt) {
        System.out.println("Withdraw from Account");
    }

    void checkBalance() {
        System.out.println("Balance: Rs " + balance);
    }
}

class StandardAccount extends Account {

    StandardAccount(String name, double balance) {
        super(name, balance);
    }

    void withdraw(double amt) {
        if (amt <= 100000) {
            balance -= amt;
            System.out.println("Withdrawn Rs " + amt);
        } else {
            System.out.println("Limit exceeded for Standard Account");
        }
    }
}

class PremiumAccount extends Account {

    PremiumAccount(String name, double balance) {
        super(name, balance);
    }

    void withdraw(double amt) {
        if (amt <= 1000000) {
            balance -= amt;
            System.out.println("Withdrawn Rs " + amt);
        } else {
            System.out.println("Limit exceeded for Premium Account");
        }
    }
}

public class program1 {
    public static void main(String[] args) {

        Account acc;

        acc = new StandardAccount("Abhinav", 300000);
        acc.deposit(50000);
        acc.withdraw(80000);
        acc.checkBalance();

        acc = new PremiumAccount("Rahul", 1200000);
        acc.withdraw(500000);
        acc.checkBalance();
    }
}
