import java.util.ArrayList;

public class Bank {
    String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addNewBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(Branch.createBranch(branchName));
            System.out.println(branchName+ " created");
            return true;
        }
        System.out.println("Branch "+branchName+" already exists");
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            return (existingBranch.newCustomer(customerName,initialAmount));
        }
        System.out.println("Branch "+branchName+" does not exists");
        return false;
    }

    public boolean addTransaction(String branchName, String customerName, double amount) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            return (existingBranch.addCustomerTransaction(customerName,amount));
        }
        System.out.println("Branch "+branchName+" was not found. amount not added");
        return false;
    }

    public boolean listCustomer(String branchName, boolean showTransactions) {
        ArrayList<Customer> existingCustomer = findBranch(branchName).getCustomers();
        System.out.println("Customer at branch "+branchName);
        if (existingCustomer != null) {
            for (int i = 0; i < existingCustomer.size(); i++) {
                Customer customer = existingCustomer.get(i);
                System.out.println((i+1)+" --> "+customer.getName());
                if (showTransactions) {
                    System.out.println("Transaction");
                    ArrayList<Double> transaction = customer.getTransaction();
                    for (int j=0 ; j<transaction.size(); j++) {
                        System.out.println("{"+(j+1)+"} "+"--> "+transaction.get(j));
                    }
                }
            }
            return true;
        }
        System.out.println("No customer at the branch");
        return false;
        }

    private Branch findBranch(String name) {
        for (int i = 0; i < this.branches.size() ; i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(name)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}
