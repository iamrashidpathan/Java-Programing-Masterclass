package academy.learnprograming;

public class HealthyBurger extends Hamburger {
    private boolean proteinShake;
    private boolean boiledEgg;

    // Constructor
    public HealthyBurger(String meat, boolean lettuce, boolean tomato,
                         boolean carrot, boolean onion) {
        super("Brown bread roll", meat, lettuce, tomato, carrot, onion);
        super.setPrice(130.0); // Hardcoding to sets the initial price to sum of price of additional items.
        super.setName("Healthy Burger");
        this.proteinShake = true; // price = 100
        this.boiledEgg = true; // price = 30
    }

    // override the showPrice
    @Override
    public void showPrice() {
        System.out.println("Bill for your Healthy Burger :");
        System.out.println("Protein Shake : 100");
        System.out.println("Boiled edd : 30");
        super.showPrice();
    }




}
