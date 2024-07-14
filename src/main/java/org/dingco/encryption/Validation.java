package org.dingco.encryption;

public class Validation {
    public static boolean validateSpace(char c) {
        if (c == ' ') {
            return true;
        }
        return false;
    }

    public static boolean validateLetter(char c) {
        if (!Character.isLetter(c)) {
            return true;
        }
        return false;
    }

    public static boolean validate(char c) {
        return Validation.validateSpace(c) || Validation.validateLetter(c);
    }
}
