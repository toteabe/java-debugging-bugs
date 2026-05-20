package edu.debugging.bugs;

/**
 * Programa de práctica de depuración.
 *
 * Una contraseña es válida si cumple todas estas condiciones:
 * - Tiene al menos 8 caracteres.
 * - Contiene al menos una letra mayúscula.
 * - Contiene al menos una letra minúscula.
 * - Contiene al menos un dígito.
 * - Contiene al menos un carácter especial: !, ?, @, #, $ o %.
 *
 * Este programa contiene errores intencionados.
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
