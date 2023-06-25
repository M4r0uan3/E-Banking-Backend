package ma.emsi.ebankingbackend.services;

import ma.emsi.ebankingbackend.entities.BankAccount;
import ma.emsi.ebankingbackend.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BankService {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    public void consulter(){
        BankAccount bankAccount = bankAccountRepository.findById("0bea7c98-010f-48bc-8fe5-ff6d3344377f").orElse(null);
        if(bankAccount!=null){
            System.out.println("********************************************");
            System.out.println();
        }
    }

}
