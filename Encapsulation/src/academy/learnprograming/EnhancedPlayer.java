package academy.learnprograming;

public class EnhancedPlayer {

    //This class uses encapsulation to protect(hide) the internal fields and from being directly accessed.

    //fields
    private String name;
    private int hitPoint = 100; // internally we are using hitPoint for health. for hiding it from external access.
    private String weapon;

    //Constructor
    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.hitPoint = health;
        }
        this.weapon = weapon;
    }

    // instance method to reduce health of the player after damage.
    public void loseHealth(int damage) {
        this.hitPoint -= damage;
        if (this.hitPoint <=0) {
            System.out.println("enhancedPlayer knocked out");
        }
    }

    //getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return hitPoint;
    }

    public String getWeapon() {
        return weapon;
    }
}

