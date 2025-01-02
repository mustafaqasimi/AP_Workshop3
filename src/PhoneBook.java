import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contactList;
    public PhoneBook() {
        contactList = new ArrayList<Contact>();
    }
    public String addContact(Contact newContact) {
        for (Contact contact : contactList) {
            if (
                    newContact.getFirstName().equals(contact.getFirstName()) &&
                            newContact.getLastName().equals(contact.getLastName())) {
                return "failed";
            }
        }
        contactList.add(newContact);
        return "ok";
    }
    public String removeContact(Contact remContact) {
        boolean flag = contactList.removeIf(contact->
                contact.getFirstName().equalsIgnoreCase(remContact.getFirstName()) &&
                        contact.getLastName().equalsIgnoreCase(remContact.getLastName()));
        if (flag)
            return "ok";
        else
            return "failed";

    }
    public Contact searchContact(String name,String lastName) {
        for(Contact contact : contactList) {
            if(contact.getFirstName().equalsIgnoreCase(name)&&
            contact.getLastName().equalsIgnoreCase(lastName)) {
                return contact;
            }
        }
        return null;
    }
    public void displayContacts() {
        for(Contact contact : contactList) {
            System.out.println(contact.getFirstName() + " " + contact.getLastName());
        }
    }
    public List<Contact> getContacts() {
        return contactList;
    }

    public void showGrouped (String groupName) {
        List<Contact> groupedContacts = new ArrayList<>();
        for (Contact contact : contactList) {
            if (contact.getGroup().equals(groupName)) {
                groupedContacts.add(contact);
            }
        }
        for (Contact groupedContact : groupedContacts) {
            searchContact(groupedContact.getFirstName(), groupedContact.getLastName());
        }
    }

}
