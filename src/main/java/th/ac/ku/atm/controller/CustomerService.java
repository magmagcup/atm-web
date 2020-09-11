package th.ac.ku.atm.controller;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    private List<Customer> customers = new ArrayList<>();

    public void createCustomer(Customer customer) {
        int hashedPin = hash(customer.getPin());
        customer.setPin(hashedPin);
        customers.add(customer);
    }

    @PostConstruct
    public void postConstruct() {
        this.customers = new ArrayList<>();
    }


    public List<Customer> getCustomers() {
        return new ArrayList<>(this.customers);
    }

    private int hash(int value) {
        return value;
    }
}
