
class bankaccount {

    void deposit() {
        System.out.println("Deposit can be done here ");
    }

    void withdraw() {
        System.out.println("Withdraw can be done");
    }
}

class SavingsAccount extends bankaccount {

    int balance = 2000;

    void withdraw() {
        if (balance > 1000) {
            System.out.println("You can Withdraw money from savings");
        } else {
            System.out.println("You cant withdraw money from savings");
        }
    }
}

public class BankAccount {

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.withdraw();
    }
}
