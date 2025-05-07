package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.AccountValidator;

public class AccountCreationTest {
    @Test
    public void testValidNames() {
        assertTrue(AccountValidator.isValidName("Sedra"));
        assertTrue(AccountValidator.isValidName("Alchhabi"));
    }

    @Test
    public void testInvalidNames() {
        assertFalse(AccountValidator.isValidName("S3dr@"));
        assertFalse(AccountValidator.isValidName(""));
        assertFalse(AccountValidator.isValidName(null));
    }

    @Test
    public void testEmailFormats() {
        assertTrue(AccountValidator.isValidEmail("sedra.alchhabi@gmail.com"));
        assertTrue(AccountValidator.isValidEmail("s.alchhabi_2000@univ.edu"));
        assertFalse(AccountValidator.isValidEmail("sedra@.com"));
        assertFalse(AccountValidator.isValidEmail("sedra@gmail"));
        assertFalse(AccountValidator.isValidEmail("@gmail.com"));
        assertFalse(AccountValidator.isValidEmail(null));
    }

    @Test
    public void testPasswordRules() {
        assertTrue(AccountValidator.isValidPassword("Sedra@2000"));
        assertFalse(AccountValidator.isValidPassword("Sedra22"));
        assertFalse(AccountValidator.isValidPassword("A".repeat(21)));
        assertFalse(AccountValidator.isValidPassword("sedra2000"));
        assertFalse(AccountValidator.isValidPassword(null));
    }

    @Test
    public void testDOBValidation() {
        assertTrue(AccountValidator.isValidDOB("22/05/2000"));
        assertFalse(AccountValidator.isValidDOB("2000-05-22"));
        assertFalse(AccountValidator.isValidDOB("32/05/2000"));
        assertFalse(AccountValidator.isValidDOB("22/13/2000"));
        assertFalse(AccountValidator.isValidDOB(null));
    }

    @Test
    public void testPasswordMatch() {
        assertTrue(AccountValidator.doPasswordsMatch("Sedra@2000", "Sedra@2000"));
        assertFalse(AccountValidator.doPasswordsMatch("Sedra@2000", "Sedra@2001"));
        assertFalse(AccountValidator.doPasswordsMatch(null, "test"));
        assertFalse(AccountValidator.doPasswordsMatch("test", null));
        assertFalse(AccountValidator.doPasswordsMatch(null, null));
    }
}