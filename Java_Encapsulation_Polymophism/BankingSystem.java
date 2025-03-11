package Java_Encapsulation_Polymophism;


// Loanable interface
interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

// Abstract class BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Abstract method
    public abstract double calculateInterest();

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }
}

// SavingsAccount class (implements Loanable)
class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 4.5; // 4.5% annual interest

    SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (INTEREST_RATE / 100);
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan application submitted for Savings Account.");
    }

    @Override
    public double calculateLoanEligibility() {
        // Loan eligibility is 5 times the balance
        return getBalance() * 5;
    }
}

// CurrentAccount class
class CurrentAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.5; // 0.5% annual interest

    CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (INTEREST_RATE / 100);
    }
}

// Main class to demonstrate the banking system
public class BankingSystem {
    public static void main(String[] args) {
        // Create a list of bank accounts
        BankAccount[] accounts = {
            new SavingsAccount("SA12345", "Deepak", 5000.0),
            new CurrentAccount("CA67890", "Ritick", 10000.0)
        };

        // Process each account
        for (BankAccount account : accounts) {
            System.out.println("/nAccount Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Current Balance: Rs." + account.getBalance());

            // Deposit and withdraw
            account.deposit(1000.0);
            account.withdraw(500.0);

            // Calculate and display interest
            double interest = account.calculateInterest();
            System.out.println("Interest Earned: Rs," + interest);

            // Check if the account is loanable
            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                loanableAccount.applyForLoan();
                double loanEligibility = loanableAccount.calculateLoanEligibility();
                System.out.println("Loan Eligibility: Rs " + loanEligibility);
            }
            
        }
    }
}