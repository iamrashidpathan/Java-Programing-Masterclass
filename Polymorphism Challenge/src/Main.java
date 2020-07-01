
// Challenge
// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

// Solution

// Super class Car
class Car {

    // fields
    private String name;
    private String engine;
    private int cylinders;
    private int noOfWheels;

    // Constructor
    public Car(String name, String engine, int cylinders) {
        this.name = name;
        this.engine = engine;
        this.cylinders = cylinders;
        this.noOfWheels = 4;
    }

    // Instance method
    public void startEngine() {
        System.out.println(this.getName()+" is starting");
    }

    // Instance method
    public void accelerate(double accelerationRate) {
        System.out.println(this.name+" is accelerating at "+accelerationRate+".");
    }

    // Instance method
    public void brake() {
        System.out.println("Applying the breaks");
    }

    // We will be overriding below class to display polymorphism.
    public String returnColor() {
        return "Red";
    }

    // getters
    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }
}

// Class Swift inherits from class Car
class Swift extends Car {
    // Constructor
    public Swift() {
        super("Swift","Diesel",2);
    }

    // Overriding the Color
    @Override
    public String returnColor() {
        return "Black";
    }
}

// Class Alto inherits from class Car
class Alto extends Car {

    // Constructor
    public Alto(){
        super("Alto","Diesel",2);
    }

    // Overriding the color
    @Override
    public String returnColor() {
        return "Blue";
    }
}

// Class KIA inherits from class Car
class KIA extends Car {

    // Constructor
    public KIA(){
        super("KIA","Diesel",4);
    }
    // We did not override the colour for KIA
}

// Main Class
public class Main {

    // main method
    public static void main (String[] args) {

        // Creating object of Swift and calling methods
        Car swift = new Swift();
        swift.startEngine();
        swift.accelerate(3.4);
        swift.brake();
        System.out.println(swift.getName()+" color is "+swift.returnColor());

        System.out.println(); // leaving a line

        // Creating object of KIA and calling methods
        Car KIA = new KIA();
        KIA.startEngine();
        KIA.accelerate(2.1);
        KIA.brake();
        System.out.println(KIA.getName()+" color is "+KIA.returnColor());

        System.out.println(); // leaving a line

        // Creating object of Alto and calling methods
        Car Alto = new Alto();
        Alto.startEngine();
        Alto.accelerate(1.1);
        Alto.brake();
        System.out.println(Alto.getName()+" color is "+Alto.returnColor());
    }
}


