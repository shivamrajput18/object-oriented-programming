package Bank;

public class Main {
    public static void main(String[] args) {
        Bank uco = new Bank("UCO");
        Bank Axis = new Bank("Axis");

        Customer c1 = new Customer("Deepak");
        Customer c2 = new Customer("rohit");

        uco.openAccount(c1, 10000);
        uco.openAccount(c2, 30000);
        Axis.openAccount(c2, 50000);

        c1.viewBalance();
        c2.viewBalance();



    }
}
