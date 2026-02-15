
/** 3.Problem: Write a program to simulate a bank account system where multiple threads
 can deposit and withdraw money. Ensure that the balance updates correctly when
 multiple transactions happen concurrently.
 Objective: Understand how to use the synchronized keyword to avoid race conditions
 and ensure thread safety.*/
class BankAccount1 {

    private int accountBalance;
    public BankAccount1(int initialBalance) {
        this.accountBalance = initialBalance;
    }

    // synchronized ensures only one thread modifies balance at a time
    public synchronized void depositAmount(int depositMoney, String threadName) {
        accountBalance += depositMoney;
        System.out.println(threadName + " deposited " + depositMoney +
                " | Updated Balance: " + accountBalance);
    }

    public synchronized void withdrawAmount(int withdrawMoney, String threadName) {
        if (accountBalance >= withdrawMoney) {
            accountBalance -= withdrawMoney;
            System.out.println(threadName + " withdrew " + withdrawMoney +
                    " | Updated Balance: " + accountBalance);
        } else {
            System.out.println(threadName + " tried to withdraw " + withdrawMoney +
                    " | Insufficient balance! Current Balance: " + accountBalance);
        }
    }
}

public class Three {

    public static void main(String[] args) {

        BankAccount1 sharedBankAccount = new BankAccount1(1000);

        // Deposit thread
        Thread depositThread = new Thread(() -> {
            sharedBankAccount.depositAmount(500, "Deposit Thread");
            sharedBankAccount.depositAmount(300, "Deposit Thread");
        });

        // Withdraw thread
        Thread withdrawThread = new Thread(() -> {
            sharedBankAccount.withdrawAmount(400, "Withdraw Thread");
            sharedBankAccount.withdrawAmount(700, "Withdraw Thread");
        });

        depositThread.start();
        withdrawThread.start();
    }
}
