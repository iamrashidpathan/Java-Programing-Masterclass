import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Challenge:
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        // Solution:
        System.out.println("How many integers do you want to enter?\r");

        // using scanner object to read the number of integers user want to enter
        int numberOfIntegers = scanner.nextInt();

        // getIntegers returns an array of values entered by user. it is stored in myIntArray
        int[] myIntArray = getIntegers(numberOfIntegers);

        // printing the entered value
        System.out.println("Entered values :");
        printArray(myIntArray);

        // sortInteger returns an array with sorted myIntArray. it is stored in sortedArray
        int[] sortedArray = sortInteger(myIntArray);

        // printing sorted array
        System.out.println("Sorted array :");
        printArray(sortedArray);
    }

    // getIntegers method takes integer inputs from user and stores it in an array then returns the array.
    public static int[] getIntegers(int number) {
        System.out.println("Enter "+number+" Integer values.");
        int[] array = new int[number];

        for (int i =0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // print all the elements of the array
    public static void printArray(int[] array) {
        for (int i = 0; i<array.length; i++) {
            System.out.println("Element "+i+" was "+array[i]);
        }
    }

    // sorting the elements in descending order.
    public static int[] sortInteger(int[] array) {

        // making a copy on array in sortedArray
        int[] sortedArray = new int[array.length];
        for (int i =0; i<array.length; i++) {
            sortedArray[i] = array[i];
        }

        // checking values and swapping them to get an array sorted in descending order.
        for (int i =0; i<sortedArray.length; i++) {
            int max = sortedArray[i];
            for (int j = i+1; j<sortedArray.length; j++) {
                if (sortedArray[j]>max){
                    max = sortedArray[j];
                    sortedArray[j] = sortedArray[i];
                    sortedArray[i] = max;
                }
            }
        }
        return sortedArray;
    }
}
