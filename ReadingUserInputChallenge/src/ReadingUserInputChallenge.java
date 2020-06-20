import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCounter = 1;
        int sum =0;
        while (inputCounter<=10) {
            System.out.println("Enter number #"+inputCounter+": ");
            if ((scanner.hasNextInt())){
                int number = scanner.nextInt();
                scanner.nextLine();
                sum += number;
            }else {
                System.out.println("Invalid Number");
                scanner.nextLine();
            }
            inputCounter++;
        }
        scanner.close();
        System.out.println("Sum is : "+sum);
    }
}
