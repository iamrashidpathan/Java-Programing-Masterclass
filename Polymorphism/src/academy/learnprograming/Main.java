package academy.learnprograming;

// Movie class (super class)
class Movie {

    //fields
    private String name;
    public Movie(String name) {
        this.name = name;
    }

    //instance method which returns plot. (we will be overriding this method in further lines of this code.)
    public String plot() {
        return "No plot here";
    }

    //getters
    public String getName() {
        return name;
    }
}

// Class Jaws, inherits from Movies class
class Jaws extends Movie {

    // Constructor
    public Jaws() {
        super("Jaws");
    }
    // Overriding the plot method
    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
}

// Class independenceDay inherits from Movie class
class independenceDay extends Movie {

    //Constructor
    public independenceDay() {
        super("Independence Day");
    }

    // Overriding the Plot method
    @Override
    public String plot() {
        return "Aliens attempt to take over planet Earth";
    }
}

// Class mazeRunner inherits from Movie Class
class mazeRunner extends Movie{

    // Constructor
    public mazeRunner() {
        super("Maze Runner");
    }

    // Overriding the plot method
    @Override
    public String plot() {
        return "Kids try to escape a maze";
    }
}

// Class starWars Inherits from Movie Class
class starWars extends Movie {

    // Constructor
    public starWars() {
        super("Star Wars");
    }

    // Overriding the plot method
    @Override
    public String plot() {
        return "Imperial forces try to takeover the universe";
    }
}

// Class ForgetAble inherits from Movie Class
class ForgetAble extends Movie {

    // Constructor
    public ForgetAble() {
        super("ForgetAble");
    }
    //No plot method
}

// Main Class
public class Main {

    // Main method
    public static void main(String[] args) {

        // looping to generate 10 random numbers and call the classes randomly.
        for (int i =1; i<11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #"+ i +
                            " : "+movie.getName() + "\n" +
                                "Plot : "+movie.plot() + "\n");
            // movie.plot in above line is an example of polymorphism. it first looks for the plot() method in the base
            // class. if cant find then goes to the super class to look fir the method.
        }
    }

    // randomMovie method returns an object of Movie class. it generates a random number and then uses switch case
    // to return the object depending on the value of random number generated.
    public static Movie randomMovie() {
        int randomNumber = (int) ((Math.random()) * 5 +1);
        System.out.println("Random number generated was= "+randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
                // No need of break as we are returning from the method.
            case 2:
                return new independenceDay();
            case 3:
                return new mazeRunner();
            case 4:
                return new starWars();
            case 5:
                return new ForgetAble();
        }
        return null;
    }
}
