import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();

    }

    public static Branch createBranch(String name) {
        return (new Branch(name));
    }

    public boolean newCustomer (String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            this.customers.add(Customer.createCustomer(customerName,initialTransaction));
            System.out.println(customerName+" added");
            return true;
        }
        System.out.println(customerName+" already exist at "+this.name+" branch");
        return false;
    }

    public boolean addCustomerTransaction (String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransactions(amount);
            System.out.println(amount+" added to "+existingCustomer.getName());
            return true;
        }
        System.out.println(customerName+" was not found. amount not added");
        return false;
    }


    private Customer findCustomer(String name) {
        for (int i = 0; i < this.customers.size() ; i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(name)) {
                return checkedCustomer;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
