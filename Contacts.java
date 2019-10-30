import java.util.ArrayList;

public class Contacts {
    private ArrayList<String> contacts = new ArrayList<String>();

    public void addContact(String Contact) {
        contacts.add(Contact);
    }

    public void showContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i));
        }
    }

    public void removeContact(int position) {
        String theContact = contacts.get(position);
        contacts.remove(position);
    }

    public void editContact(String currentContact, String newContact) {
        int position = findContact(currentContact);
        if (position >= 0) {
            editContact(position, newContact);
        }
    }

    public void editContact(int position, String newContact){
        contacts.set(position, newContact);
        System.out.println("Contact " + (position + 1) + " has been modified");
    }

    public int findContact(String searchContacts){
        return contacts.indexOf(searchContacts);
    }

    public boolean inContacts(String searchContact) {
        int position = findContact(searchContact);
        if(position >= 0) {
            return true;
        }
        return false;
    }
}

