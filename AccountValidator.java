package main;

public class AccountValidator {
    public static boolean isValidName(String name) {
        return name != null && name.matches("[A-Za-z]+");
    }

    public static boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
    }

    public static boolean isValidPassword(String password) {
        return password != null && 
               password.length() >= 8 && 
               password.length() <= 20 && 
               password.matches(".*[!@#$%^&*].*");
    }

    public static boolean isValidDOB(String dob) {
        return dob != null && dob.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$");
    }

    public static boolean doPasswordsMatch(String p1, String p2) {
        return p1 != null && p2 != null && p1.equals(p2);
    }
}