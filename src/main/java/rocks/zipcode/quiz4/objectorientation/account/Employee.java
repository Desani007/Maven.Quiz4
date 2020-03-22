package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker,Transactable {
    BankAccount bankAccount;
    Double expectedHourlyWage ;
    Double expectedHoursWorked ;
    Double expectedBalance ;
    Double expectedBankAccountBalance;
    Double expectedMoneyEarned;

    public Employee() {

        this.bankAccount=new BankAccount();
        this.expectedHourlyWage=35.0;
        this.expectedHoursWorked=0.0;
        this.expectedBalance = 0.0;;
        this.expectedBankAccountBalance = 0.0;

    }



    public Employee(BankAccount bankAccount) {
        this.expectedHourlyWage=35.0;
        expectedBalance = 15.0;
        expectedHoursWorked=0.0;
        expectedBankAccountBalance = 0.0;

        this.bankAccount=bankAccount;
    }

    public BankAccount getBankAccount() {


        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount=bankAccount;

    }


    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        expectedHoursWorked+=numberOfHours;

    }

    @Override
    public Double getHoursWorked() {

        return this.expectedHoursWorked;
    }

    @Override
    public Double getHourlyWage() {

        return this.expectedHourlyWage;
    }

    @Override
    public Double getMoneyEarned() {

        return this.expectedBalance;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {

        this.bankAccount.deposit(amountToIncreaseBy);

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        this.bankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {

        return this.bankAccount.getBalance();
    }
}
