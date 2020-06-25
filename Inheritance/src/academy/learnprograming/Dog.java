package academy.learnprograming;

public class Dog extends Animal {

    private int eyes; // adding features exclusive to dog class.
    private int legs; // with all this features dag also has features
    private int tail; // from Animal class. as we extended from animal class.
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); // calls the constructor of the class we inherit from

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this. teeth = teeth;
        this.coat = coat;
    }



    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();// calls eat from super class
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5); //calls super class
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10); // looks for local class, if not available than calls super class.
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLeg() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
