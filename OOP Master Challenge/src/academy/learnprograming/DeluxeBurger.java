package academy.learnprograming;

public class DeluxeBurger extends Hamburger {

    //fields
    private boolean chips;
    private boolean drinks;

    //Constructor
    public DeluxeBurger(String rollType, String meat, boolean lettuce, boolean tomato, boolean carrot,
                                                                                         boolean onion) {
        super(rollType, meat, lettuce, tomato, carrot, onion);
        super.setName("Deluxe Burger");
        super.setPrice(80.0); // Hardcoding to sets the price to sum of the additional items price.
        this.chips = true;// price = 30
        this.drinks = true; // price = 50
    }

    // override the showPrice
    @Override
    public void showPrice() {
        System.out.println("Bill for your Deluxe Burger :");
        System.out.println("Chips : 30");
        System.out.println("Drinks : 50");
        super.showPrice();
    }
}
