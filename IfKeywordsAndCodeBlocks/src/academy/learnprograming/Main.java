package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int  bonus = 100;

//        if (score == 5000) System.out.println("Your score was 5000"); // for only one line in if
//
//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        }else if (score < 1000){
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got hare");
//        }

        if (gameOver == true){
            int finalScore = score +levelCompleted * bonus;
            System.out.println("Your final score was "+finalScore);
        }

        //Challenge
        //score set to 1000
        //levelCompleted set to 8
        //bonus set to 200
        //but make sure the first printout above still displays as well

        //Solution
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver){
            int finalScore = score + levelCompleted * bonus;
            System.out.println("Your final Score "+finalScore);
        }
    }
}
