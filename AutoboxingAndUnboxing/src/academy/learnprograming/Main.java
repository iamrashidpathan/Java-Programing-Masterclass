package academy.learnprograming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Integer integer = 21; // Integer is a class

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(Integer.valueOf(i)); // autoboxing
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(integerArrayList.get(i).intValue()); // unboxing
        }

        Integer myIntValue = 56; // Integer.valueOf(56); . autoboxing
        int myInt = myIntValue; // myIntValue.intValue(); . unboxing

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0 ;dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl)); // we may remove valueOf(dbl) and write dbl directly
        }

        for (int i = 0; i< myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue(); // we may remove .doubleValue()
            System.out.println(i +" --> "+value);
        }

    }
}
