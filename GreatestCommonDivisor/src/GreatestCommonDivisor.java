public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor (int first, int second) {
        if (first <10 || second <10) return -1;
        int min = Math.min(second, first);
        while (min > 1) {
            if (first % min == 0 && second % min == 0) {
                return min;
            }min--;
        }
        return -1;
    }
}
