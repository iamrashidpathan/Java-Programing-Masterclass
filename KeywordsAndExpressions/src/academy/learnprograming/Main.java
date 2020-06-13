package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344); // kilometers = (100 * 1.609344) is an expression. data type is not a part of expression

        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        //Challenge, identify the expressions in below code

        int score = 100;// score =100 is an expression
        if (score > 99) { // score > 99 is an expression
            System.out.println("You got the high score!"); // "You got the high Score!" is an expression
            score = 0; // score = 0 is an expression
        }
    }
}
