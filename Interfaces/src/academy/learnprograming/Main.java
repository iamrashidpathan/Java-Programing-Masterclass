package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        ITelephone  jimmyPhone; // jimmyPhone is of type ITelephone (Interface)
        jimmyPhone = new DeskPhone(123456789);
        jimmyPhone.powerOn();
        jimmyPhone.callPhone(12356789);

        jimmyPhone = new MobilePhone(123456789);
        jimmyPhone.powerOn();
        jimmyPhone.callPhone(123456789);
        jimmyPhone.answer();
    }
}
