package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte byteValue= 23;
        short shortValue = 432;
        int intValue = 676232;

        long longValue = 50000L+(10L*(byteValue+shortValue+intValue));
        System.out.println("Long value is = "+longValue);
    }
}
