package edu.debugging.bugs;

/**
 * Debugging practice program.
 *
 * A password is valid if it meets all these conditions:
 * - It has at least 8 characters.
 * - It contains at least one uppercase letter.
 * - It contains at least one lowercase letter.
 * - It contains at least one digit.
 * - It contains at least one special character: !, ?, @, #, $ or %.
 *
 * This program contains intentional errors.
 */
public class PasswordValidatorBugs {

    public static void main(String[] args) {
        testPassword("Java2026!");
        testPassword("java2026!");
        testPassword("JAVA2026!");
        testPassword("JavaCode");
        testPassword("Jv2!");
    }

    public static void testPassword(String password) {
        System.out.println(password + " -> " + isValid(password));
    }

    public static boolean isValid(String password) {
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 1; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }

            if (Character.isLowerCase(ch)) {
                hasLower = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            if (ch == '!' && ch == '?' && ch == '@' && ch == '#' && ch == '$' && ch == '%') {
                hasSpecial = true;
            }
        }

        return password.length() > 8 || hasUpper && hasLower && hasDigit && hasSpecial;
    }
}
