package academy.learnprograming;

public class PC {

    //Composition to Case, monitor and MotherBoard class
    private Case theCase;  //Composition
    private Monitor monitor; //Composition
    private Motherboard motherboard; //Composition

    //Constructor
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    //instance method which calls the private method drawLogo
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    // hiding drawLogo from public use
    private void drawLogo() {
        //fancy graphics
        monitor.drawPixelAt(1200,50,"yellow");
    }

    //getters
    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
}
