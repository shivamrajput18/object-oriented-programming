package Level2;

// Bank Account Management

// Create a BankAccount class with:
// accountNumber (public).
// accountHolder (protected).
// balance (private).
// Write methods to:
// Access and modify balance using public methods.
// Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder.

public class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    // parematrized constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void updateBalance(double bal) {
        this.balance = bal;
    }

    public double getBalance() {
        return balance;
    }

    // Method to display account details
    void displayAccountDetails() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Balance: " + balance);

    }

}

class SavingsAccount extends BankAccount {

    // parematrized constructor
    SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance); // call the parent constructor
    }

    void displayAccountDetails() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        // System.out.println("Account Balance: " + balance);

    }
}

class MainAcc {
    public static void main(String[] args) {
        // creating saving account object s1
        SavingsAccount s1 = new SavingsAccount(1237485393, "Deepak", 20000);
        s1.displayAccountDetails();
    }

}