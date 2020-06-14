package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int value = 3;
        if (value == 1) System.out.println("Value was 1");
        else if (value == 2) System.out.println("Value was 2");
        else System.out.println("was not 1 or 2");

        //This can be done alternatively using switch case

        int switchValue = 1;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3,4 or 5");
                break;
            default:
                System.out.println("Value was neither 1 or 2");
                break;
        }
        //Challenge:
        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        //Solution:
        char charSwitch = 'B';//case sensitive

        switch (charSwitch) {
            case 'A':
                System.out.println("Character was A");
                break;
            case 'B' :
                System.out.println("Character was B");
                break;
            case 'C' :
                System.out.println("Character was C");
                break;
            case 'D' :
                System.out.println("Character was D");
                break;
            case 'E' :
                System.out.println("Character was E");
                break;
            default:
                System.out.println("Character was not found");
                break;
        }
    }
}
