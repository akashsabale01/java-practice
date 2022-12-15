package bankaccount;

import bankaccount.Account;

public class SavingAccount extends Account
{
    public double fixedDepositAmount;


    public SavingAccount(long accountNo, String accountHolderName, String address, String phoneNo, String dateOfBirth) {
        super(accountNo, accountHolderName, address, phoneNo, dateOfBirth);
        this.fixedDepositAmount = 0.0;
    }

    public void deposit(double amountToDeposit){
        balance += amountToDeposit;
        System.out.println("\nCash Deposit Operation Successful");
    }

    public void withdraw(double amountToWithdraw){
        if(balance == 0){
            System.out.println("\nBalance is zero");
            return;
        }
        else if ((balance -= amountToWithdraw) < 0) {
            return;
        }

        balance -= amountToWithdraw;

        System.out.println("\nCash withdrawal Operation Successful");
    }

    public void addFixDeposit(double amountToAddInFixDeposit){
        fixedDepositAmount += amountToAddInFixDeposit;
        System.out.println("\nAdding Fix Deposit operation Successful");
    }

    public void liquidateFixDeposit(){
        if(fixedDepositAmount == 0){
            System.out.println("\nNot Valid, fixed Deposit Amount = 0");
            return;
        }

        fixedDepositAmount  = 0;

        System.out.println("\nLiquidate Fix Deposit operation Successful");
    }

    public double getFixedDepositAmount() {
        return fixedDepositAmount;
    }
}
