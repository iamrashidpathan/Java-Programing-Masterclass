public class NumberPalindrome {
    public static boolean isPalindrome (int number) {
        if (number < 0) number *= -1;
        int reverse =0;
        int copy = number;
        while (number > 0) {
            int extract = number % 10;
            //System.out.println("Extract = "+extract);
            reverse = (reverse *10) + extract;
            //System.out.println("reverse = "+reverse);
            number /= 10;
            //System.out.println("number = "+number);
        }return reverse == copy;
    }
}
