public class LargestPrime {
    public static int getLargestPrime (int number) {
        if (number<=0) return -1;
        int largeDivider = -1;
        int divider = 2;
        while (divider<=number) {
            if (number % divider == 0 && divider > largeDivider) {
                int counter =0;
                for (int i =2; i<divider; i++) {
                    if (divider % i == 0) counter++;
                }
                if (!(counter > 0)) largeDivider = divider;
            }
            divider++;
        }
        return (largeDivider);
    }

}
