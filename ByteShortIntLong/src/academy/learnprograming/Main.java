package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = "+myMinIntValue);
        System.out.println("Integer Maximum value = "+myMaxIntValue);
        System.out.println("Busted MAX value = "+ (myMaxIntValue+1));
        System.out.println("Busted MIN value = "+ (myMinIntValue-1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = "+myMinByteValue);
        System.out.println("byte Maximum value = "+myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = "+myMinShortValue);
        System.out.println("Short Maximum value = "+myMaxShortValue);

        long myLongValue =100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = "+myMinLongValue);
        System.out.println("long Maximum value = "+myMaxLongValue);
        System.out.println(myLongValue);

        byte myNewByteValue = (byte)(myMinByteValue/2);
        System.out.println(myNewByteValue);

        //Challenge
        byte b = 120;
        short s =435;
        int i = 6525;
        long ln = 50000+(10*(b+s+i));
        System.out.println("the long value is = "+ln);

    }
}
