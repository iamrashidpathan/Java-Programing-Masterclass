public class Main {
    public static void main(String[] args) {

        // Challenge
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        // Solution
        Bank sbi = new Bank("State Bank of India");
        sbi.addNewBranch("Dhatkidih");

        sbi.addCustomer("Dhatkidih","Jimmy",500.0);
        sbi.addCustomer("Dhatkidih","Rimmy",5000.0);
        sbi.addCustomer("Dhatkidih","Raffa",50.0);

        sbi.addNewBranch("Kadma");
        sbi.addCustomer("Kadma","Tipu",0.0);

        sbi.addTransaction("Dhatkidih","Jimmy",100.43);
        sbi.addTransaction("Dhatkidih","Jimmy",10.43);
        sbi.addTransaction("Dhatkidih","Raffa",1000.43);

        sbi.listCustomer("Dhatkidih",true);
        sbi.listCustomer("Kadma",true);

        sbi.addCustomer("Sakchi","Moti",800.0);

        sbi.addNewBranch("Dhatkidih");
        sbi.addTransaction("Dhatkidih","jim",600);
        sbi.addTransaction("Sonari","Jim",400.0);

        sbi.addCustomer("Dhatkidih","Raffa",50.0);
    }
}
