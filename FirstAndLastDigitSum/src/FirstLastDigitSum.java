public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) return -1;
        int lastDigit = number % 10;
        int sum =0;
        while ( number > 0) {
            if (number < 10){
                sum = sum +lastDigit + number;
                break;
            }
            number /= 10;
        }return sum;
    }
}
