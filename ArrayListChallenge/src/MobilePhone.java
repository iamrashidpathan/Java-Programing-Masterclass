import java.util.ArrayList;

public class MobilePhone {
    // fields
    private String myNumber;
    private ArrayList<Contact> myContact;

    // Constructor
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }

    // adding new contact
    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContact.add(contact);
        return true;
    }

    // updating existing contact
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        int searchName = findContact(newContact.getName());
        if (searchName >= 0) {
            System.out.println(newContact.getName()+" already exists");
            return false;
        }
        if (position < 0) {
            System.out.println(oldContact.getName()+" was not found");
            return false;
        }
            updateContact(position,newContact);
            System.out.println(oldContact.getName() + " was replaced by "+newContact.getName());
            return true;
    }

    private void updateContact(int position, Contact newContact) {
        this.myContact.set(position,newContact);
    }

    // removing contact
    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position < 0) {
            System.out.println(contact.getName()+" was not found");
            return false;
        }
        this.myContact.remove(position);
        System.out.println(contact.getName()+" was deleted");
        return true;
    }

    // finding contact on thr array list
    private int findContact(Contact contact) {
        return this.myContact.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.myContact.size(); i++) {
            Contact contact = this.myContact.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    // query contact
    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >=0) {
            return this.myContact.get(position);
        }
        return null;
    }

    // print all the contact on the array list
    public void printContact() {
        System.out.println("Contact List");
        for (int i = 0; i < this.myContact.size(); i++) {
            System.out.println((i+1)+" - "+this.myContact.get(i).getName() + " -> "+
                               this.myContact.get(i).getPhoneNumber());

        }
    }

    // getters
    public ArrayList<Contact> getMyContact() {
        return myContact;
    }
}
