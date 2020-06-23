public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer () {
        this("Avilash",65000.0,"avilash@123.com");
    }

    public VipCustomer(String name, String emailAddress) {
        this.creditLimit = 5000L;
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name,double creditLimit, String emailAddress) {
        //System.out.println("called");
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
