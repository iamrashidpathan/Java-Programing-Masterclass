package academy.learnprograming;

public class Case {

    //fields
    private String model;
    private String manufacturer;
    private String powerSupply;

    //Composition to Dimensions class
    private Dimensions dimension;

    //Constructor
    public Case(String model, String manufacturer, String powerSupply, Dimensions dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }

    //instance method
    public void pressPowerButton() {
        System.out.println("Power button pressed.");
    }

    //getters
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimension() {
        return dimension;
    }
}
