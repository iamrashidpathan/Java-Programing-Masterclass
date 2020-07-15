package academy.learnprograming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Jimmy", 560.89);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance fo customer "+customer.getName()+" is "+customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(2);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i+ ": "+intList.get(i));
        }
        System.out.println();
        intList.add(1,1);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i+ ": "+intList.get(i));
        }
    }
}
