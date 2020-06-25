package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("Milo",8,20,2,4,1,20,"long silky");

        dog.eat();//we are able to use eat method through Dog class. eat was defined in Animal class.

        //System.out.println(dog.getSize());
        dog.walk();
        dog.run();
    }
}
