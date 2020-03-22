package rocks.zipcode.quiz4.objectorientation.account;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    List accountList;

   public Bank(){
        this.accountList=new ArrayList<Account>();
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
          for ( int i=0; i<accountList.size();i++){
              if ( indexNumber==i) {
                  accountList.remove(i);
              }
       }
       return null;
    }

    public void addBankAccount(BankAccount bankAccount) {
        accountList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {

       return accountList.contains(bankAccount);

       // throw new UnsupportedOperationException("Method not yet implemented");
    }
}
