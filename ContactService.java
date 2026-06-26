
package contactservice;

import java.util.ArrayList;
import java.util.List;

public class ContactService {
    private final List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        for (Contact existingContact : contacts) {
            if (existingContact.getContactId().equals(contact.getContactId())) {
                throw new IllegalArgumentException("Contact ID already exists");
            }
        }
        contacts.add(contact);
    }

    public void deleteContact(String contactId) {
        Contact contactToRemove = null;

        for (Contact contact : contacts) {
            if (contact.getContactId().equals(contactId)) {
                contactToRemove = contact;
                break;
            }
        }

        if (contactToRemove == null) {
            throw new IllegalArgumentException("Contact not found");
        }

        contacts.remove(contactToRemove);
    }

    public void updateFirstName(String contactId, String firstName) {
        findContact(contactId).setFirstName(firstName);
    }

    public void updateLastName(String contactId, String lastName) {
        findContact(contactId).setLastName(lastName);
    }

    public void updatePhone(String contactId, String phone) {
        findContact(contactId).setPhone(phone);
    }

    public void updateAddress(String contactId, String address) {
        findContact(contactId).setAddress(address);
    }

    public Contact findContact(String contactId) {
        for (Contact contact : contacts) {
            if (contact.getContactId().equals(contactId)) {
                return contact;
            }
        }
        throw new IllegalArgumentException("Contact not found");
    }
}