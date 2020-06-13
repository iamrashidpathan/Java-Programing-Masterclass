package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = "+result);
        int previousResult = result;
        System.out.println("previousResult = "+previousResult);

        result = result - 1;//2
        System.out.println("3 - 1 = "+result);
        System.out.println("previousResult = "+previousResult);
        //note that the value of previousResult did not change even if we changed the value to result after assigning

        result = result * 10;//2*10= 20
        System.out.println("2 * 10 = "+result);

        result = result / 5; //20 / 5 = 4
        System.out.println("20 / 5 = "+result);

        result = result % 3; //the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = "+result);

        //Abbreviating operators
        result++; //1 + 1 =2
        System.out.println("1 + 1 = "+result);
        result--; //2 - 1 = 1
        System.out.println("2 - 1 = "+result);

        // result = result + 2
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = "+result);
        //can be done with all major operators

        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = "+result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore == 100){ //compares
            System.out.println("You got the highest score");
        }

        if (topScore != 100) { //not equal, opposite of compare (==)
            System.out.println("First top Score is not the highest score");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) { // both conditions should be true for AND operator
            System.out.println("Greater than second top score and less than 100");
        }

        if (topScore > 90 || secondTopScore <= 90) { //either or both condition should be true for OR operator
            System.out.println("Either or both of the conditions are true");
        }

        //Challenge
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }
        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not suppose to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("wasCar is true");
        }

        //Challenge

        double myDouble = 20.00d;
        double mySecondDouble = 80.00d;

        double addition = (myDouble + mySecondDouble) * 100.00d;
        double remainder = addition % 40.00d;
        System.out.println("Remainder= " + remainder);
        boolean isRemainderZero = remainder == 0 ? true : false;
        System.out.println("Zero remainder = " + isRemainderZero);

        if (!isRemainderZero){
            System.out.println("Got some remainder");
        }



    }
}
