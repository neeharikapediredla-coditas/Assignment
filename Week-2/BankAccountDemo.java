//QUESTION-4
/**
 4. Create a class BankAccount with: -
 • A private variable balance
 • An inner class Transaction that can: -
 o Deposit money
 o Withdraw money

 Demonstrate how the inner class accesses private members of the outer class.
 */

import java.util.Scanner;

public class BankAccountDemo {

    private double balance=0;

    class Transaction{

        void deposit(double a){
            balance+=a;
        }

        void withdraw(double a){
            if(a>balance)
                System.out.println("Insufficient Balance");
            else
                balance-=a;
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        BankAccountDemo acc=new BankAccountDemo();
        Transaction t=acc.new Transaction();

        System.out.print("Enter deposit amount: ");
        t.deposit(sc.nextDouble());

        System.out.print("Enter withdraw amount: ");
        t.withdraw(sc.nextDouble());

        System.out.println("Final Balance: "+acc.balance);
    }
}