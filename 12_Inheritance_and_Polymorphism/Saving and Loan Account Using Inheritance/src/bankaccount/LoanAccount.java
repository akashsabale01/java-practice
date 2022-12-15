package bankaccount;

import bankaccount.Account;

public class LoanAccount extends Account {

    public double loanAmount;

    public LoanAccount(long accountNo, String accountHolderName, String address, String phoneNo, String dateOfBirth) {
        super(accountNo, accountHolderName, address, phoneNo, dateOfBirth);
    }

    public void payEMI(double amount){
        if(loanAmount == 0){
            System.out.println("\nLoan amount");
            return;
        }

        loanAmount -= amount;

        System.out.println("\nPay EMI Operation Successful");
    }


}
