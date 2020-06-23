public class Main {
    public static void main(String[] args) {
        BankAccount jimmyAccount = new BankAccount(
                "8752361268581259",0.0,
                "Jimmy","123@abc.com",
                "6732986543");

//        jimmyAccount.setCustomerName("Jimmy");
//        jimmyAccount.setBalance(2000000);
//        jimmyAccount.setCustomerEmailAddress("123@abc.com");
//        jimmyAccount.setCustomerPhoneNumber("6732986543");
//        jimmyAccount.setNumber("8752361268581259");

        jimmyAccount.deposit(300);
        jimmyAccount.withdraw(200);

        BankAccount timAccount = new BankAccount("Tim","123@tim.com",
                                "12345");

        timAccount.deposit(500);
        timAccount.withdraw(120);
        System.out.println(timAccount.getNumber());
        //timAccount.withdraw(1389.5);
        System.out.println();


        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.

        //Solution

        VipCustomer rahilAccount = new VipCustomer("Rahil Khan", 26999999D,
                "rahil@123.com");

        System.out.println("Rahil credit limit "+rahilAccount.getCreditLimit());

        VipCustomer avilashAccount = new VipCustomer();
        System.out.println("Avilash credit limit "+avilashAccount.getCreditLimit());

        VipCustomer anmolAccount = new VipCustomer("Anmol","anmol@123.com");
        System.out.println("Anmol credit limit "+anmolAccount.getCreditLimit());



    }

}
