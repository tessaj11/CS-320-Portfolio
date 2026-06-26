package contactservice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    public void testContactCreatedSuccessfully() {
        Contact contact = new Contact("12345", "Tessa", "Holmes", "1234567890", "123 Main Street");

        assertEquals("12345", contact.getContactId());
        assertEquals("Tessa", contact.getFirstName());
        assertEquals("Holmes", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main Street", contact.getAddress());
    }

    @Test
    public void testInvalidContactIdTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Tessa", "Holmes", "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testInvalidContactIdNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Tessa", "Holmes", "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testInvalidFirstNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "VeryLongName", "Holmes", "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testInvalidFirstNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", null, "Holmes", "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testInvalidLastNameTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Tessa", "VeryLongLastName", "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testInvalidLastNameNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Tessa", null, "1234567890", "123 Main Street");
        });
    }

    @Test
    public void testInvalidPhoneTooShort() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Tessa", "Holmes", "12345", "123 Main Street");
        });
    }

    @Test
    public void testInvalidPhoneNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Tessa", "Holmes", null, "123 Main Street");
        });
    }

    @Test
    public void testInvalidPhoneNonDigits() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Tessa", "Holmes", "abcdefghij", "123 Main Street");
        });
    }

    @Test
    public void testInvalidAddressTooLong() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Tessa", "Holmes", "1234567890",
                    "This address is definitely too long");
        });
    }

    @Test
    public void testInvalidAddressNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Tessa", "Holmes", "1234567890", null);
        });
    }
}