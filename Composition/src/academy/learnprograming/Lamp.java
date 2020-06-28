package academy.learnprograming;

public class Lamp {

    //fields
    private String style;
    private boolean battery;
    private int globRating;

    //Constructors
    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    //instance method
    public void turnOn() {
        System.out.println("Lamp > Turning On");
    }

    //getters
    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
