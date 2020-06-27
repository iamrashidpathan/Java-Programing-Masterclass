public class Cylinder extends Circle{ // inherits circle class
    private double height;
    public Cylinder(double radius, double height) {
        super(radius); // passes to circle (super) class

        if (height<0) {
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public double getVolume() {
        return (getArea()*height); //gets area from super class method
    }

    public double getHeight() {
        return height;
    }
}
