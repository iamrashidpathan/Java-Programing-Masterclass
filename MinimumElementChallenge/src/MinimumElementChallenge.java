import java.util.Scanner;

public class MinimumElementChallenge {
    private static Scanner scanner = new Scanner(System.in);


    // Challenge
//    -Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//
//            -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//
//            -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//
//            -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//
//            -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//
//            -Finally, print the minimum element in the array.
//
//            Tips:
//              -Assume that the user will only enter numbers, never letters
//	            -For simplicity, create a Scanner as a static field to help with data input
//	            -Create a new console project with the name eMinElementChallengef
    public static void main(String[] args) {
        // Solution
        System.out.println("How many integers do you want to enter?\r");

        // using scanner object to read the number of integers user want to enter
        int numberOfIntegers = scanner.nextInt();

        // getIntegers returns an array of values entered by user. it is stored in myIntArray
        int[] myIntArray = getIntegers(numberOfIntegers);

        int minimumValue = findMin(myIntArray);
        System.out.println("Minimum value = "+minimumValue);
    }

    // getIntegers method takes integer inputs from user and stores it in an array then returns the array.
    private static int[] getIntegers(int number) {
        System.out.println("Enter "+number+" Integer values.");
        int[] array = new int[number];

        for (int i =0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // findMin method finds the minimum value in the array.
    private static int findMin (int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i =0; i<array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }



}
