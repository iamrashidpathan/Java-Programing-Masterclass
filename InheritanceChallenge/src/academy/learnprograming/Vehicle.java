package academy.learnprograming;

public class Vehicle {
    private int noOfWheels;
    private String EngineType;
    private double mileage;
    private double currentDirection;
    private double currentVelocity;
    private int gear;

    public Vehicle(int noOfWheels, String EngineType,double mileage, double currentVelocity) {
        this.noOfWheels = noOfWheels;
        this.EngineType = EngineType;
        this.mileage = mileage;
        this.currentVelocity = currentVelocity;
    }

    public void handSteering(double direction) {
        this.currentDirection = direction;
        System.out.println("Vehicle is steering at "+getCurrentDirection()+" degree");
    }

    public void changingGear(int gear) {
        this.gear = gear;
        System.out.println("Vehicle is running at gear no "+getGear()+".");
    }

    public void move(double currentVelocity) {
        this.currentVelocity = currentVelocity;
        System.out.println("Vehicle is moving at the velocity of "+getCurrentVelocity()+" km/hr.");
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public String getEngineType() {
        return EngineType;
    }

    public double getMileage() {
        return mileage;
    }

    public double getCurrentDirection() {
        return currentDirection;
    }

    public double getCurrentVelocity() {
        return currentVelocity;
    }

    public int getGear() {
        return gear;
    }
}
