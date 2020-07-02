package academy.learnprograming;

public class Hamburger {

    // fields
    private String name = "Hamburger";
    private String rollType;
    private String meat;
    private double price;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean onion;

    // Constructor
    public Hamburger(String rollType, String meat, boolean lettuce, boolean tomato, boolean carrot, boolean onion) {
        this.rollType = rollType;
        this.meat = meat;
        //this.price = price;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.onion = onion;
    }

    // Instance method to print and calculate the price of base hamburger.
    // Hardcoding all the prices
    public void showPrice() {
        if (name.equals("Hamburger")){
            System.out.println("Bill for your "+getName()+" :");
        }
        switch (getRollType()) {
            case "Plain bread roll":
                System.out.println("Plain bread roll : 20");
                this.price += 20;
                break;
            case "Honey bread roll":
                System.out.println("Honey bread roll : 30");
                this.price += 30;
                break;
            case "Brown bread roll":
                System.out.println("Brown bread roll : 40");
                this.price += 40;
                break;
            default:
                System.out.println("Wrong input");
        }

        switch (getMeat()) {
            case "Beef":
                System.out.println("Beef : 200");
                this.price += 200;
                break;
            case "Pork":
                System.out.println("Pork : 150");
                this.price += 150;
                break;
            case "Chicken":
                System.out.println("Chicken : 100");
                this.price += 100;
                break;
            default:
                System.out.println("Wrong input");
        }

        if (isLettuce()) {
            System.out.println("Lettuce : 15");
            this.price += 15;
        }
        if (isCarrot()) {
            System.out.println("Carrot : 10");
            this.price += 10;
        }
        if (isOnion()) {
            System.out.println("Onion : 5");
            this.price += 5;
        }
        if (isTomato()) {
            System.out.println("Tomato : 5");
            this.price += 5;
        }

        System.out.println("Grand total :"+this.getPrice());
    }

    //getters
    public String getName() {
        return name;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isOnion() {
        return onion;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
    }

    public void setOnion(boolean onion) {
        this.onion = onion;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
