package academy.learnprograming;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    // below method adds item to the ArrayList
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    // printGroceryList prints the complete list
    public void printGroceryList() {
        System.out.println("You have "+groceryList.size()+" items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + " - "+groceryList.get(i));
        }
    }

    // modifyGroceryItem modifies an item on the list
    public void modifyGroceryItem(String itemName, String newItem){
        int position = findItem(itemName);
        modifyGroceryItem(position,newItem);
    }
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position,newItem);
        System.out.println("Grocery item "+(position+1)+ " has been modified");
    }

    // removeGroceryItem removes an item form the list
    public void removeGroceryItem(String itemName) {
        int position = findItem(itemName);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    // findItem returns the index of the item on the list. returns -1 if item is not on the list
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    // onList returns "true" if the item is on the list. returns "false" otherwise
    public boolean onList(String searchItem) {
        int position = findItem(searchItem);
        return position >= 0;
    }

    // getters
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
