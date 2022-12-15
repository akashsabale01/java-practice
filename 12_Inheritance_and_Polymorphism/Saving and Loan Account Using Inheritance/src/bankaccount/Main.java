package bankaccount;

public class Main {
    public static void main(String[] args) {

        SavingAccount saveObj1 = new SavingAccount(1234453144, "Mari Selvaraj", "Pune", "9937819729", "09112021");

        saveObj1.deposit(200000);
        System.out.println("Balance = " + saveObj1.getBalance());
        saveObj1.withdraw(100);
        System.out.println("Balance = " + saveObj1.getBalance());

        saveObj1.addFixDeposit(50000);
        System.out.println("Fix Deposit Amount = " + saveObj1.getFixedDepositAmount());
        saveObj1.liquidateFixDeposit();
        System.out.println("Fix Deposit Amount = " + saveObj1.getFixedDepositAmount());

        // create object of Loan account & perform its operations


    }
}