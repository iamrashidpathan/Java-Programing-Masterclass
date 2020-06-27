package academy.learnprograming;

public class Car extends Vehicle{
    private String color;
    private boolean ac;
    private int seats;

    public Car(int noOfWheels, String EngineType, double mileage, String color, boolean ac, int seats) {
        super(noOfWheels,EngineType,mileage,0); // current velocity is zero as car starting from rest.
        this.color = color;
        this.ac = ac;
        this.seats = seats;
    }

    public void playMusic(String title) {
        System.out.println(title+" is playing");
    }

    public String getColor() {
        return color;
    }

    public boolean isAc() {
        return ac;
    }

    public int getSeats() {
        return seats;
    }
}
