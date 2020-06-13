package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        int finalScore = calculateScore(true, 800,5,100);
        System.out.println("Your final Score was = "+finalScore);

        int finalScore2 = calculateScore(true,10000,8,200);
        System.out.println("Your second final score was = "+finalScore2);
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//        if (gameOver){
//            int finalScore = score + levelCompleted * bonus;
//            System.out.println("Your final Score "+finalScore);
//        }
        int positionOnHighScoreTable = calculateHighScorePosition(1500);
        displayHighScorePosition("Rashid",positionOnHighScoreTable);

        positionOnHighScoreTable = calculateHighScorePosition(900);
        displayHighScorePosition("Sourav",positionOnHighScoreTable);

        positionOnHighScoreTable = calculateHighScorePosition(400);
        displayHighScorePosition("Avilash",positionOnHighScoreTable);

        positionOnHighScoreTable = calculateHighScorePosition(50);
        displayHighScorePosition("Anmol",positionOnHighScoreTable);


    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
        if (gameOver) {
            int finalScore = score + levelCompleted * bonus;
            finalScore += 1000;
          //  System.out.println("Your final Score " + finalScore);
            return (finalScore);

        }else {
            return -1;
        }
    }

    //Challenge:
    // Create a method called displayHighScorePosition
    // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like " managed to get into position " and the
    // position they got and a further message " on the high score table".
    //
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an int
    // the return data should be
    // 1 if the score is >=1000
    // 2 if the score is >=500 and < 1000
    // 3 if the score is >=100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400 and 50
    //
    //Solution:

    public static void displayHighScorePosition(String playerName, int positionOnHighScoreTable) {
        System.out.println(playerName + " managed to get into position " +
                +positionOnHighScoreTable+" on the high score table");
        //return -1;
    }

     public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) position =  1;
        else if (playerScore >= 500) position = 2;
        else if (playerScore >= 100) position = 3;
        return position;
     }

     // methods to be called from main method





}
