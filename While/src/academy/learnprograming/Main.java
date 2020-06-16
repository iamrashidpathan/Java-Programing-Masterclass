package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count =1;
        while (count != 6){
            System.out.println("Count value is = "+count);
            count++;
        }
        // same thing on for loop
        for (int i =1; i<6; i++) {
            System.out.println("i value is = "+i);
        }

        // infinite while loop

        count =1;
        while (true) {
            if (count == 6) break;
            System.out.println("I was infinite while loop, thanks for the break. I am tired of running!.count = "+count);
            count++;
        }

        //do while
        count = 1;
        do {
            System.out.println("I am do while and count = "+count);
            count++;
        }while (count != 6);

        //Challenge
        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        // return true if an even number, otherwise return false;

        //Solution
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound =0;
        while (number <= finishNumber) {
            number++;
            if (isEvenNumber(number)) {
                System.out.println("Even number = "+number);
                evenNumbersFound++;
            }
            if (evenNumbersFound == 5) break;
        }
        System.out.println("Number of even number found = "+evenNumbersFound);

        //Challenge
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found // done

    }
    public static boolean isEvenNumber (int number) {
        return number % 2 ==0;
    }
}
