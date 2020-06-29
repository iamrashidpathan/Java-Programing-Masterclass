package academy.learnprograming;

// This class does not uses encapsulation. So, all the fields and methods are directly accessible. this is not
// recommended. as user can easily manipulate it.
public class Player {

    //fields
    public String name;
    public int health;
    public String weapon;

    //instance method to reduce health of a player after damage.
    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <=0) {
            System.out.println("Player knocked out");
            //Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
