package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator.printSum(5,10);
        printHello();
        Calculator hell = new Calculator();
        hell.printHell();
        Dog dog = new Dog("Mota");
        dog.bark();
        Dog rex = new Dog("Rex"); // creates instance rex
        Dog fluffy = new Dog("Fluffy");// creates instance fluffy
        rex.printName();// prints fluffy
        fluffy.printName();// prints fluffy, as name is an static variable. if we changed it to instance
                            // variable then we can have a different copy of name for both instance of class Dog
    }

    public static void printHello() {
        System.out.println("Hello");
    }
}
