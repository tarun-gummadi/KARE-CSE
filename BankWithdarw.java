
import java.util.Scanner;

public class BankWithdarw {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double wd;
        double balance = 2000;
        double dep;
        BankAccount ba = new BankAccount();
        savingsaccount sa = new savingsaccount();
        System.out.println("enter 1 for the deposit and 0 for the withdrawal");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("enter the amount you are going to deposit");
            dep = sc.nextInt();
            System.out.println(ba.deposit(dep, balance));
        } else if (a == 0) {
            System.out.println("enter the amount your are going to withdraw");
            wd = sc.nextInt();
            sa.withdrawal(wd, balance);
        }
        sc.close();
    }
}

class BankAccount {

    double deposit(double dep, double balance) {
        return balance + dep;

    }

    void withdrawal() {
        System.out.println("this is going to be overridden");
    }
}

class savingsaccount extends BankAccount {

    void withdrawal(double wd, double balance) {
        if (balance - wd < 1000) {
            System.out.println("the transaction is declined due to the low balance");
        } else {
            System.out.println("the transaction is successful" + (balance - wd));
        }
    }
}

//  wrtite java program to create clas called emplpyee with methods called work and getsalary subclass class HR Manager that overrides work method and creates new moths called new employee
