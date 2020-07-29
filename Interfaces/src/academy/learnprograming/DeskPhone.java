package academy.learnprograming;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
        this.isRinging = false;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken as desk phone do not have power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing "+ phoneNumber + " on desk phone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber ) {
            isRinging = true;
            System.out.println("Ring Ring");
        }
        else {
            System.out.println("Not the same number");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
