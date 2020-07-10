public class Contact {

    // fields
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // returns an object of class Contact
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name,phoneNumber);
    }

    // getters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
