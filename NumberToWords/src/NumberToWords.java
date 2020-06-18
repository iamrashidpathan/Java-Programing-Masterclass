public class NumberToWords {
    public static void numberToWords (int number) {
        int reverse = reverse(number);
        int copyReverse = reverse;
        if (number<0) System.out.println("Invalid Value");
        while (reverse>0) {
            int digit = reverse % 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

            } reverse /= 10;
        }
        int zeros = getDigitCount(number) - getDigitCount(copyReverse);
        //System.out.println("Zeros = "+zeros);
        if (zeros != 0){
            for (int i=0; i<zeros; i++){
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        boolean negativeCheck = false;
        if (number<0){
            number = number*-1;
            negativeCheck = true;
        }
        while (number>0) {
            int extract = number % 10;
            reverse = (reverse*10)+extract;
            number/=10;
        }
        if (negativeCheck) reverse *= -1;
        return reverse;
    }

    public static int getDigitCount (int number) {
        if (number == 0) return 1;
        if (number<0) return -1;
        int count = 0;
        while (number>0){
            count++;
            number/=10;
        }return count;
    }
}
