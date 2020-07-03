package academy.learnprograming;

import java.util.Scanner;

public class Main {
    
    // creating an scanner object
    private static Scanner scanner = new Scanner(System.in);
    
    // main class
    public static void main(String[] args) {
        //callling getIntegers with 5 to get a array of 5 elements.
        int[] myIntegers = getIntegers(5);
        
        // printing out all the elements of array,
        for (int i = 0; i<myIntegers.length; i++) {
            System.out.println("Element "+i+" was "+myIntegers[i]);
        }
        
        // calling getAverage method and printing the average of the elements of array.
        System.out.println("Average of entered numbers is "+getAverage(myIntegers));
    }
    
    // getIntegers method takes integers inputs from user and stores it in an array then returns the array.
    public static int[] getIntegers(int number) {
        System.out.println("Enter "+number+" Integer values.");
        int[] array = new int[number];

        for (int i =0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    //returns the average of the elements of the integer array
    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i<array.length; i++) {
            sum += array[i];
        }
        return ((double) sum / (double) array.length);
    }
}
