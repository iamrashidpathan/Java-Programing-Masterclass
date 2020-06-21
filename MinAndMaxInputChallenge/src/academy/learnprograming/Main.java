package academy.learnprograming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int number =0;
        int max = Integer.MIN_VALUE; //-2147483647
        int min = Integer.MAX_VALUE; //2147483647
//        boolean first = true;

        while (true) {
            System.out.println("Enter Number");

            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
//                if (first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if (number>max) max=number;
                if (number<min) min = number;
            } else {
                System.out.println("Maximum number is : "+max);
                System.out.println("Minimum number is : "+min);
                break;
            }
            scanner.nextLine(); // to handle the enter key
        }
        scanner.close();
    }
}
