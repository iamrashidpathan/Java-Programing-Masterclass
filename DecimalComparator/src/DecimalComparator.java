public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double num1, double num2) {
        boolean result = false;
        if((int)(num1*1000)-(int)(num2*1000)==0) {
            result = true;
        }return result;
    }
}
