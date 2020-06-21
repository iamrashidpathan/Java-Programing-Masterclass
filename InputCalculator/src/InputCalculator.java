import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage () {
        int sum = 0;
        long average =0;
        int number;
        double avgCount = 0.0;


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Number");// comment out this line before uploading on Udemy
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();

                //SUM
                sum += number;
                // average divider
                avgCount++;
            } else {
                average= Math.round((sum/avgCount));
                break;
            }
        }
        scanner.nextLine();

        System.out.println("SUM = "+sum+" AVG = "+average);
        scanner.close();
    }
}
