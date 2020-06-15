package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("10,000 at 2% interest = "+calculateInterest(10000.0d,2.0d));
        System.out.println("10,000 at 3% interest = "+calculateInterest(10000.0d,3.0d));
        System.out.println("10,000 at 4% interest = "+calculateInterest(10000.0d,4.0d));
        System.out.println("10,000 at 5% interest = "+calculateInterest(10000.0d,5.0d));

        //Challenge, using for loop call calculateInterest for interestRate 2,3,4,5,6,7 and 8:
        System.out.println("Solution for challenge:");

        for (double i=2; i<9;i++) {
            System.out.println("forLoop: 10,000 at "+i+"% interest = "+String.format("%.2f",calculateInterest(10000,i)));
        }
        //Challenge, above challenge in reverse order.
        for (double i=8; i>1;i--) {
            System.out.println("forLoopRev: 10,000 at "+i+"% interest = "+String.format("%.2f",calculateInterest(10000,i)));
        }

        System.out.println(isPrime(2));
        System.out.println(isPrime(5));
        System.out.println(isPrime(33));
        System.out.println(isPrime(7));

        //Challenge:
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit

        //Solution:
        int count =0;
        for (int i=2; i<=20000;i++) {
            boolean prime = isPrime(i);
            if (prime){
                System.out.println(i+" is prime");
                count++;
                if (count == 100) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }   //System.out.println("Number of prime number found = "+count);


    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i < n/2; i++) {
            if (n%i ==0) return false;
        }return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
