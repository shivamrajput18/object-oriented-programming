package Bank;

public class Account {
    private Bank bank;
    private double balance;

    Account(Bank bank, Double balance){
        this.bank = bank;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public Bank getBank() {
        return bank;
    }

}
