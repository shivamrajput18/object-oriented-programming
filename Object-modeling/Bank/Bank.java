package Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Customer> Customers;

    Bank(String name){
        this.name = name;
        this.Customers = new ArrayList<>();
    }

    void openAccount(Customer customer, double initialDeposit){

        Account newAccount = new Account(this, initialDeposit);
        customer.addAccount(newAccount);

        if(!Customers.contains(customer)){
            Customers.add(customer);
        }

    }

    public String getName() {
        return name;
    }

}
