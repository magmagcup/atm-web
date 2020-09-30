package th.ac.ku.atm.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class BankAccount {
    private int id;
    private int customerId;
    private String type;
    private double balance;

    public void BankAccount(int id, int customerId, String type, double balance){
        this.id = id;
        this.customerId = customerId;
        this.type = type;
        this.balance = balance;
    }

    public int getId() { return this.id;}

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() { return this.customerId;}

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getType() { return this.type;}

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() { return this.balance;}

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", CustomerId=" + customerId +
                ", Type=" + type +
                ", Balance=" + balance;
    }
}
