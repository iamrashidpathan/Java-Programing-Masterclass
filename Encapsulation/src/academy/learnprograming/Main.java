package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        //Encapsulation refers to hiding the inner workings of the class from external access.

        //player without encapsulation. Bad practice
        Player player = new Player();
        player.name = "Jimmy";
        player.health = 20;
        player.weapon = "Axe";

        int damage = 10;
        player.loseHealth(damage);

        System.out.println("Remaining health for player= "+player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining Health for player= "+player.healthRemaining());

        System.out.println(); // leaving a line

        //EnhancedPlayer using encapsulation
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Jimmy",50,"Axe");
        System.out.println("Initial health of enhancedPlayer is "+enhancedPlayer.getHealth());

        enhancedPlayer.loseHealth(21);

        //Challenge
        // Create a class and demonstrate proper encapsulation techniques
        // the class will be called Printer
        // It will simulate a real Computer Printer
        // It should have fields for the toner Level, number of pages printed, and
        // also whether its a duplex printer (capable of printing on both sides of the paper).
        // Add methods to fill up the toner (up to a maximum of 100%), another method to
        // simulate printing a page (which should increase the number of pages printed).
        // Decide on the scope, whether to use constructors, and anything else you think is needed.

        //Solution
        System.out.println();// leaving a line
        System.out.println("Solution: ");// marking the start of solution for the challenge

        Printer printer = new Printer(50,true);
        System.out.println("Initial page count "+printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " +
                                                                            printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " +
                                                                            printer.getPagesPrinted());


    }
}
