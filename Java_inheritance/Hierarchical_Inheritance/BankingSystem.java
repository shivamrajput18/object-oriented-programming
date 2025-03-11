package Java_inheritance.Hierarchical_Inheritance;

// Base class: BankAccount
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs " + amount);
        System.out.println("New Balance: Rs " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: Rs " + amount);
            System.out.println("New Balance: Rs " + balance);
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs " + balance);
    }
}

// Subclass: SavingsAccount extends BankAccount
class SavingsAccount extends BankAccount {
    private double interestRate; // Annual interest rate in %

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;
        System.out.println("Interest Applied: Rs " + interest);
        System.out.println("New Balance after Interest: Rs " + balance);
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

// Subclass: CheckingAccount extends BankAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit; // Daily withdrawal limit

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal exceeds limit of Rs " + withdrawalLimit);
        } else {
            super.withdraw(amount);
        }
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}

// Subclass: FixedDepositAccount extends BankAccount
class FixedDepositAccount extends BankAccount {
    private int depositTerm; // Deposit term in months

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}

// Main class to test
public class BankingSystem {
    public static void main(String[] args) {
        System.out.println("=== Savings Account ===");
        SavingsAccount savings = new SavingsAccount("SA12345", 5000.0, 4.5);
        savings.displayAccountInfo();
        savings.displayAccountType();
        savings.applyInterest();

        System.out.println("\n=== Checking Account ===");
        CheckingAccount checking = new CheckingAccount("CA67890", 2000.0, 1000.0);
        checking.displayAccountInfo();
        checking.displayAccountType();
        checking.withdraw(1200); // Exceeds limit
        checking.withdraw(800);  // Valid withdrawal

        System.out.println("\n=== Fixed Deposit Account ===");
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD54321", 10000.0, 12);
        fixedDeposit.displayAccountInfo();
        fixedDeposit.displayAccountType();
    }
}
