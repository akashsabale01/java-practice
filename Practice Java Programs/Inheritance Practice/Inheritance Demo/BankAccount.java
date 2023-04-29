public class BankAccount {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount(512, "Maria", "Pune", 332223432, "22/12/97", 100);

        System.out.println(s.getAccountNo());
        System.out.println(s.getName());
        System.out.println(s.getAddress());
        System.out.println(s.getPhoneNo());
        System.out.println(s.getDob());
        System.out.println(s.getBalance());

        System.out.println(s.toString());

        s.deposit(400);
        System.out.println(s.getBalance());

        s.withdraw(200);
        System.out.println(s.getBalance());

        System.out.println(s.toString());

    }
}

class Account {
    private int accountNo;
    private String name;
    private String address;
    private int phoneNo;
    private String dob;
    private double balance;

    public Account(int accountNo, String name, String address, int phoneNo, String dob, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public String getDob() {
        return dob;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo=" + phoneNo +
                ", dob='" + dob + '\'' +
                ", balance=" + balance +
                '}';
    }
}

class SavingAccount extends Account {

    public SavingAccount(int accountNo, String name, String address, int phoneNo, String dob, double balance) {
        super(accountNo, name, address, phoneNo, dob, balance);
    }

    public void deposit(double amountToDeposit) {
//        if (amountToDeposit < 0) {
//            System.out.println("Your have entered Negative Amount, Please enter positive amount...");
//            return;
//        }

        double currentBalance = getBalance();
        double updatedBalance = currentBalance + amountToDeposit;
        setBalance(updatedBalance);
        System.out.println("Amount " + amountToDeposit + " Deposited Successfully");
    }

    public void withdraw(double amountToWithdraw) {
        double currentBalance = getBalance();
//        if (amountToDeposit < 0) {
//            System.out.println("Your have entered Negative Amount, Please enter positive amount...");
//            return;
//        } else if (amountToWithdraw > currentBalance) {
//            System.out.println("Insuffiecient Balance...");
//            return;
//        }
        double updatedBalance = currentBalance - amountToWithdraw;
        setBalance(updatedBalance);
        System.out.println("Amount " + amountToWithdraw + " Withdraw Successfully");
    }
}