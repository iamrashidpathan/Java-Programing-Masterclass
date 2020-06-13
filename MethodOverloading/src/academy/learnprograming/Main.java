package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("Rashid",100);
        System.out.println("New score is "+newScore);
        int newScoreOver = calculateScore(100,100);
        System.out.println("New score using overloading function is "+newScoreOver);
        calculateScore();

        //Challenge Solution calling
        double inchesToCentimeters = calcFeetAndInchesToCentimeters(25.0);
        double feetAndInchesToCentimeters = calcFeetAndInchesToCentimeters(6.0,0.0);
        }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int a,int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 2000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    //Challenge:
    //Create a method called calcFeetAndInchesTOCentimeters
    //it needs to have two parameters
    //feet is the first parameter, inch is the 2nd parameter
    //
    //you should validate the first parameter feet is >= 0
    //you should validate the 2nd parameter inches is >=0 and <=12
    //return -1 from the method if either of the above is not true
    //
    //if the parameters are valid, then calculate ow many centimeters
    //comprise the feet and inches passed to this method and return the value

    //create 2nd method of the same name but with only one parameter
    //inches is the parameter
    //validate its is >=0, return -1 if true
    //but if its valid then calc how many feet are in inches
    //and then, here is the tricky part.
    //call the other overloaded method passing the correct feet and inches calculated so that it can
    //calculate correctly
    //hint: using double is good idea
    // 1 inch = 2.54cm and 1 foot =12 inch
    //Solution:

    public static double calcFeetAndInchesToCentimeters (double feet, double inch) {
        if (feet <0 || inch >12 ||inch <0) {
            System.out.println("Invalid inputs");
            return -1;
        }
        else {
            double totalInch = inch + feet* 12;
            double centimeters = totalInch * 2.54;
            System.out.println(feet+" feet and "+inch+" inches = "+centimeters);
            return (centimeters);
        }
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        //double centimeters =0.0;
        if (inches < 0) {
            System.out.println("Invalid input");
            return -1;
        }
        else {
            double feet = (int) (inches/12.0);
            double remainingInches = (int) inches%12;
            System.out.println(inches+" inches is equal to "+feet+" feet and "+remainingInches+" inches");
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
            //return centimeters;
        }
    }
}
