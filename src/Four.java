/** 4. Problem: Implement a program where two separate objects represent two accounts,
 and you need to transfer money between them. Use different locks for each account to
 ensure thread safety without causing deadlocks.
 Objective: Learn how to manage multiple locks and avoid deadlocks in concurrent
 systems.*/

class BankAccount {
    private final String accountHolderName;
    private int accountBalance;
    public BankAccount(String accountHolderName, int initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = initialBalance;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public int getAccountBalance() {
        return accountBalance;
    }
    public void deposit(int amount) {
        accountBalance += amount;
    }
    public void withdraw(int amount) {
        accountBalance -= amount;
    }
}
class MoneyTransferService {
    public static void transferMoney(BankAccount sourceAccount, BankAccount targetAccount, int transferAmount)
    {
        BankAccount firstLock =
                sourceAccount.hashCode() < targetAccount.hashCode()
                        ? sourceAccount : targetAccount;
        BankAccount secondLock =
                sourceAccount.hashCode() < targetAccount.hashCode()
                        ? targetAccount : sourceAccount;
        synchronized (firstLock) {
            synchronized (secondLock) {
                if (sourceAccount.getAccountBalance() >= transferAmount) {
                    sourceAccount.withdraw(transferAmount);
                    targetAccount.deposit(transferAmount);
                    System.out.println(
                            Thread.currentThread().getName()
                                    + " transferred ₹" + transferAmount
                                    + " from " + sourceAccount.getAccountHolderName()
                                    + " to " + targetAccount.getAccountHolderName()
                    );
                } else {
                    System.out.println(
                            "Transfer failed due to insufficient balance in "
                                    + sourceAccount.getAccountHolderName()
                    );
                }
            }
        }
    }
}
public class Four {
    public static void main(String[] args) {
        BankAccount accountA = new BankAccount("Account A", 1000);
        BankAccount accountB = new BankAccount("Account B", 1000);

        Thread transferThreadOne = new Thread(() -> {
            MoneyTransferService.transferMoney(accountA, accountB, 300);
        }, "Transfer Thread 1");

        Thread transferThreadTwo = new Thread(() -> {
            MoneyTransferService.transferMoney(accountB, accountA, 500);
        }, "Transfer Thread 2");

        transferThreadOne.start();
        transferThreadTwo.start();
    }
}