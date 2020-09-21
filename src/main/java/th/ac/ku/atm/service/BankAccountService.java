package th.ac.ku.atm.service;

import org.springframework.stereotype.Service;
import th.ac.ku.atm.model.BankAccount;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class BankAccountService {

    private List<BankAccount> bankAccounts;

    @PostConstruct
    public void postConstruct() {
        this.bankAccounts = new ArrayList<>();
    }

    public void addBankAccount(BankAccount bankAccount){
        this.bankAccounts.add(bankAccount);
    }

    public List<BankAccount> getBankAccounts(){
        return this.bankAccounts;
    }
}
