package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberAsString = "2020";
        System.out.println("numberAsString = "+numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = "+number);

        double numberDouble = Double.parseDouble(numberAsString);
        System.out.println("numberDouble = "+numberDouble);

        numberAsString += 1;
        number +=1;
        System.out.println("numberAsString = "+numberAsString);
        System.out.println("number = "+number);
    }
}
