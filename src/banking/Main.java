package banking;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("============== ARRAY OF ACCOUNTS ==============");

        anArrayOfAccounts();

        System.out.println();

        System.out.println("============== LIST OF ACCOUNTS ==============");

        aListOfAccounts();

        System.out.println();

        System.out.println("============== DEPOSIT & WITHDRAW DEMO ==============");

        Account account = new Account(1000, 5001, AccountType.CHECKING);

        System.out.println(account);

        account.deposit(500);

        System.out.println("After Deposit:");
        System.out.println(account);

        account.withdraw(300);

        System.out.println("After Withdraw:");
        System.out.println(account);

        System.out.println();

        System.out.println("============== EXCEPTION DEMO ==============");

        try {

            Account savings = new Account(500, 6001, AccountType.SAVINGS);

            System.out.println(savings);

            savings.withdraw(1000);

        } catch (ArithmeticException e) {

            System.out.println("Exception: " + e.getMessage());

        }

    }

    // Array of Accounts
    public static void anArrayOfAccounts() {

        Account[] accounts = new Account[3];

        accounts[0] = new Account(1000, 101, AccountType.CHECKING);
        accounts[1] = new Account(2000, 102, AccountType.SAVINGS);
        accounts[2] = new Account(3000, 103, AccountType.CHECKING);

        for (Account account : accounts) {

            System.out.println(account);

        }

    }

    // List of Accounts
    public static void aListOfAccounts() {

        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(new Account(5000, 201, AccountType.SAVINGS));
        accounts.add(new Account(6000, 202, AccountType.CHECKING));
        accounts.add(new Account(7000, 203, AccountType.SAVINGS));

        for (Account account : accounts) {

            System.out.println(account);

        }

    }

}