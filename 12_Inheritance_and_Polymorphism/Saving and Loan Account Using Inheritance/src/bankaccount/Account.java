package bankaccount;

public class Account{
    public long accountNo;
    public String accountHolderName;
    public String address;
    public String phoneNo;
    public String dateOfBirth;
    public double balance;

    // Constructor
    public Account(long accountNo, String accountHolderName, String address, String phoneNo, String dateOfBirth){
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dateOfBirth = dateOfBirth;
        this.balance = 0.0;
    }

    // Property Methods

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public double getBalance() {
        return balance;
    }

//    public void closeAccount(){
//        // used to close account
//    }
}
