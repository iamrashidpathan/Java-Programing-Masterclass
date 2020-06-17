public class EvenDigitSum {
    public static int getEvenDigitSum (int number) {
        if (number<0) return -1;
        int evenDigitSum = 0;
        while (number >0) {
            int extract = number % 10;
            if (extract % 2 == 0) evenDigitSum += extract;
            number /= 10;
        }return evenDigitSum;
    }
}
