import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("23131231224");

    // Challenge
    // Create a program that implements a simple mobile phone with the following capabilities.
    // Able to store, modify, remove and query contact names.
    // You will want to create a separate class for Contacts (name and phone number).
    // Create a master class (MobilePhone) that holds the ArrayList of Contacts
    // The MobilePhone class has the functionality listed above.
    // Add a menu of options that are available.
    // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
    // and search/find contact.
    // When adding or updating be sure to check if the contact already exists (use name)
    // Be sure not to expose the inner workings of the Arraylist to MobilePhone
    // e.g. no ints, no .get(i) etc
    // MobilePhone should do everything with Contact objects only.

    public static void main(String[] args) {
        boolean quit = false;
        startPhone(); // Starting message
        printAction(); // Prints action for user

        // While loop for continuous action
        while (!quit) {
            System.out.println("\nEnter 6 to show available actions");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nShutting down....");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContact();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printAction();
                    break;
            }

        }
    }

    // Adding new contact to the phone
    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = "+ name +" phone = "+phone);
        }
        else{
            System.out.println("Can not add, "+name+" already on file");
        }
    }

    // update existing contact
    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println(name+" contact does not exists.");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newNumber);
        if (mobilePhone.updateContact(existingContactRecord,newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Update failed");
        }
    }

    // remove an existing contact
    public static void removeContact() {
        System.out.println("Enter contact name to be removed: ");
        String name = scanner.nextLine();
        Contact contactToRemove = mobilePhone.queryContact(name);
        if (contactToRemove == null) {
            System.out.println("Contact was not found");
            return;
        }
        if (mobilePhone.removeContact(contactToRemove)) {
            System.out.println(name+ " successfully deleted");
        }
        else {
            System.out.println("Deleting failed");
        }
    }

    // query for an contact
    public static void queryContact() {
        System.out.println("Enter contact name to query: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact was not found");
            return;
        }
        System.out.println("Name: "+existingContact.getName() + "Phone number is "+existingContact.getPhoneNumber());
    }

    // prints starting message
    public static void startPhone() {
        System.out.println("Starting phone");
    }

    // prints action
    private static void printAction() {
        System.out.println("\tAvailable action\nPress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                           "2 - to add new contact\n" +
                           "3 - to update an existing contact\n" +
                           "4 - to remove a contact\n" +
                           "5 - to query if existing contact exists\n" +
                           "6 - to print a list of available actions\n");
        System.out.println("Choose your action");
    }
}
