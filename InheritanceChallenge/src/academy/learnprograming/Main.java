package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Challenge.
        // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the Car class.
        // You should be able to hand steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviours (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For you specific type of vehicle you will want to add something specific for that type of car.

        Car swift = new Car(4,"Diesel",14.2,"Red",true,4);

        swift.move(23);
        swift.handSteering(45);
        swift.changingGear(3);

    }
}
