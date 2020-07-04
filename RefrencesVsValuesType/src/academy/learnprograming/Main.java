package academy.learnprograming;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Value type
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = "+myIntValue);
        System.out.println("anotherIntValue = "+anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = "+myIntValue);
        System.out.println("anotherIntValue = "+anotherIntValue);

        // Reference type
        int[] myIntArray = new int[5]; // variable stores address to the array in memory.
        int[] anotherArray = myIntArray; // reference to the same array in memory.

        System.out.println("myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray = "+Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = "+Arrays.toString(anotherArray));

        anotherArray = new int[] {4,5,6,7,8}; // changing reference of anotherArray variable.
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = "+Arrays.toString(anotherArray));
    }

    // Modifies the array
    public static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1,2,3,4,5}; // changing reference of array variable.
    }
}
