public class Cuboid extends Rectangle { // inherits from Rectangle class
    private double height;

    public Cuboid (double width, double length, double height) {
        super(width,length);  // passes to super class constructor
        if (height<0) this.height = 0;
        else this.height = height;
    }

    public double getVolume() {
        return getArea()*getHeight(); // calls super class method getArea()
    }

    public double getHeight() {
        return height;
    }
}
