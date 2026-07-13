package banking;

public class Account {

    // Properties
    private int balance;
    private int accountNumber;
    private AccountType accountType;

    // Parameterized Constructor
    public Account(int balance, int accountNumber, AccountType accountType) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    // No-Argument Constructor
    public Account() {
        this.balance = 0;
        this.accountNumber = 12345;
        this.accountType = AccountType.CHECKING;
    }

    // Getter Methods
    public int getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    // Setter Methods
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    // Deposit Method
    public void deposit(int amount) {
        balance += amount;
    }

    // Withdraw Method
    public void withdraw(int amount) {

        if (accountType == AccountType.SAVINGS && amount > balance) {
            throw new ArithmeticException("Cannot overdraw a Savings Account.");
        }

        balance -= amount;
    }

    // toString Method
    @Override
    public String toString() {
        return "The account with number " + accountNumber
                + " is of type '" + accountType
                + "' and has a balance of " + balance;
    }
}