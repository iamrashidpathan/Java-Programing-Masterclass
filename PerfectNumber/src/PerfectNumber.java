public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int sumFactors = 0;
        int divider = 1;
        while (divider < number) {
            if (number % divider == 0){
                sumFactors += divider;
                //System.out.println(divider);
            }
            divider++;
           // System.out.println(divider);
        }
        return number == sumFactors;
    }
}
