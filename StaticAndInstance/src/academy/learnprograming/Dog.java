package academy.learnprograming;

public class Dog {

    private static String name; // instance variable

    public Dog(String name) {
        Dog.name = name; // assigning to instance variable. we use this keyword for instance variable
    }

    public void printName() {
        System.out.println("name= "+name);
    }

    public void bark() {
        System.out.println("woof");
    }
}
