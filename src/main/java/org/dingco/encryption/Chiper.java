package org.dingco.encryption;

public class Chiper {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int ALPHABET_LENGTH = ALPHABET.length();

    public static String decrypt(String encodedText, int shift) {
        return proccessText(encodedText, shift, true);

    }

    public static String encrypt(String plainText, int shift) {
        return proccessText(plainText, shift, false);
    }

    private static String proccessText(String plainText, int shift, boolean isEncrypt) {
        plainText = plainText.toUpperCase();
        StringBuilder encrypted = new StringBuilder();

        for (char charInput : plainText.toCharArray()) {
            if (Validation.validate(charInput)) {
                encrypted.append(charInput);
                continue;
            }

            int index = ALPHABET.indexOf(charInput);
            int encodedIndex = encoded(index, shift, isEncrypt);
            char encodedChar = ALPHABET.charAt(encodedIndex);
            encrypted.append(encodedChar);
        }
        return encrypted.toString();
    }

    private static int encoded(int index, int shift, boolean isEncrypt) {
        if (isEncrypt) {
            int decoded = ( index - shift) % ALPHABET_LENGTH;
            if(decoded < 0) {
                decoded += ALPHABET_LENGTH;
            }
            return decoded;
        } else {
            int encoded = (index + shift) % ALPHABET_LENGTH;
            return encoded;
        }
    }
}





























/*

public static String encrypt(String plainText, int shift) {
        plainText = plainText.toUpperCase();
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char charInput = plainText.charAt(i);
            if (Validation.validate(charInput)) {
                encrypted.append(charInput);
                continue;
            }
            int index = ALPHABET.indexOf(charInput);
            int encodedIndex = (index + shift) % ALPHABET_LENGTH;
            char encodedChar = ALPHABET.charAt(encodedIndex);
            encrypted.append(encodedChar);
        }
        return encrypted.toString();
    }

    public static String decrypt(String plainText, int shift) {
        plainText = plainText.toUpperCase();
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char charInput = plainText.charAt(i);
            if (Validation.validate(charInput)) {
                encrypted.append(charInput);
                continue;
            }
            int index = ALPHABET.indexOf(charInput);
            int encodedIndex = index - shift;
            if (encodedIndex < 0) {
                encodedIndex = 25;
            }
            char encodedChar = ALPHABET.charAt(encodedIndex);
            encrypted.append(encodedChar);
        }
        return encrypted.toString();
    }



 */

