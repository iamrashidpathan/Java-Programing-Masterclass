public class BankAccount {

    private String number;
    private double balance = 0;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public BankAccount() {
//        this("8752361268581259",0.0,
//                "Jimmy","123@abc.com",
//                "6732986543");
        System.out.println("Empty Constructor called");
    }
    public BankAccount(String number, double balance, String customerName,
                       String customerEmailAddress,String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmailAddress,
                       String customerPhoneNumber) {
        this("99999",1009.5,customerName,
                customerEmailAddress,customerPhoneNumber);
        System.out.println("partial constructor called");
//        this.customerName = customerName;
//        this.customerEmailAddress = customerEmailAddress;
//        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance+= depositAmount;
        System.out.println("Deposit successful. Thank you "+this.customerName+" for using this bank");
        System.out.println("your account balance is "+this.balance);
    }

    public void withdraw(double withdrawalAmount) {
        if (balance - withdrawalAmount >= 0) {
            balance -= withdrawalAmount;
            System.out.println("Withdraw of " +withdrawalAmount+" successful");
            System.out.println("Your remaining account balance is "+this.balance);
        } else {
            System.out.println("You do not have sufficient balance");
        }

    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return this.customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
