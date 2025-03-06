package Level1;

// Bank Account Management

// Create a BankAccount class with:
// accountNumber (public).
// accountHolder (protected).
// balance (private).
// Write methods to:
// Access and modify balance using public methods.
// Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder.

public class BankAccount {

    private static String bankName = "Cental Bank"; // Static variable shared across all accounts
    private static int totalAccounts = 0; 

    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalAccounts++;
    }

    public void updateBalance(double bal) {
        this.balance = bal;
    }

    public double getBalance() {
        return balance;
    }

    void displayAccountDetails() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Balance: " + balance);

    }
     static void displayTotalAccounts(){
        System.out.println("Total accounts: "+ totalAccounts);
    }

}

class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void displayAccountDetails() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        // System.out.println("Account Balance: " + balance);

    }
}

class MainAcc {
    public static void main(String[] args) {
        
        SavingsAccount s1 = new SavingsAccount(1237485393, "Deepak",    20000);
        SavingsAccount s2 = new SavingsAccount(1237485393, "Deepak",    20000);
        SavingsAccount s3 = new SavingsAccount(1237485393, "Deepak",    20000);
        s1.displayAccountDetails();

        BankAccount.displayTotalAccounts();
    }

}