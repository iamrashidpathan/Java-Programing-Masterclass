package academy.learnprograming;

public class Monitor {

    //fields
    private String model;
    private String manufacturer;
    private int size;

    // Composition to Resolution class
    private Resolution nativeResolution;

    //Constructor
    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    //Instance method
    public void drawPixelAt(int x, int y, String colour) {
        System.out.println("Drawing pixel at "+ x + "," + y +" in colour "+colour+".");
    }

    //getters
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
