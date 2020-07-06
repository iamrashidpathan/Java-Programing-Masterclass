package academy.learnprograming;

import java.util.ArrayList;
import java.util.Scanner;

// Main class
public class Main {
    // Scanner
    private static final Scanner scanner = new Scanner(System.in);
    // ArrayList
    private static final GroceryList groceryList = new GroceryList();

    //Main method
    public static void main(String[] args) {
        // flag for while loop
        boolean quite = false;

        // Choice made by user
        int choice = 0;

        // Prints the instructions for the user
        printInstructions();

        // While loop for making selection and doing operations on ArrayList
        while (!quite) {
            System.out.print("Enter your Choice : ");
            choice = scanner.nextInt();
            scanner.nextLine(); // for enter buffer

            switch (choice) {
                case 0:
                    printInstructions();
                    break;

                case 1:
                    groceryList.printGroceryList();
                    break;

                case 2:
                    addItem();
                    break;

                case 3:
                    modifyItem();
                    break;

                case 4:
                    removeItem();
                    break;

                case 5:
                    searchForItem();
                    break;

                case 6:
                    processArrayList();
                    break;

                case 7:
                    quite = true;
                    break;

                default:
                    System.out.println("wrong selection");
            }
        }
    }

    // printInstructions prints instructions for the user
    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print the choice options");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item for the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To process arrayList");
        System.out.println("\t 7 - To quite the application");
    }

    // addItem is used to add item to the ArrayList
    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    // modifyItem modifies the entries on the ArrayList
    public static void modifyItem() {
        System.out.print("Enter item name to be modified: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newName = scanner.nextLine();
        groceryList.modifyGroceryItem(itemName, newName);
    }

    // removeItem removes an entry from ArrayList
    public static void removeItem() {
        System.out.print("Enter item name to be removed: ");
        String  itemName = scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    // searchForItem looks up the list to find if item is on the list or not.
    public static void searchForItem() {
        System.out.print("Enter the item to be searched: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onList(searchItem)) {
            System.out.println("Found "+searchItem+" in our grocery list.");
        }
        else {
            System.out.println(searchItem+" is not on grocery list.");
        }
    }

    // different ways to copy ArrayList
    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String > nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

}
