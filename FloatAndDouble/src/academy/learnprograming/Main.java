package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum value = "+myMinFloatValue);
        System.out.println("Float Maximum value = "+myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum value = "+myMinDoubleValue);
        System.out.println("Double Maximum value = "+myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue =  5f/3f;
        double myDoubleValue =5d/3d;
        System.out.println("MyIntValue= "+myIntValue);
        System.out.println("MyFloatValue= "+myFloatValue);
        System.out.println("MyDoubleValue= "+myDoubleValue);

        //Challenge
        double pounds = 200d;
        double kilograms;
        kilograms = pounds * 0.45359237d;
        System.out.println(pounds+" pounds is equal to "+kilograms+" kilograms");
    }
}
