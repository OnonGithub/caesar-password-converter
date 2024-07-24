package org.dingco.encryption;

public class Chiper {
    private static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static int ALPHABET_LENGTH = ALPHABET.length();

    public static void checkLength() {
        System.out.println(ALPHABET_LENGTH);
    }

    public static String encrypt(String word, int shift) {
        word = word.toUpperCase();
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char characterInput = word.charAt(i);
            if (Validation.validate(characterInput)) {
                encrypted.append(characterInput);
                continue;
            }
            ;
            int alphabetIndex = ALPHABET.indexOf(characterInput);
            int encryptedIndex = (alphabetIndex + shift) % ALPHABET_LENGTH;
            char encryptedChar = ALPHABET.charAt(encryptedIndex);
            encrypted.append(encryptedChar);
        }
        return encrypted.toString();
    }

    public static String decrypt(String word, int shift) {
        word = word.toUpperCase();
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char characterInput = word.charAt(i);
            if (Validation.validate(characterInput)) {
                encrypted.append(characterInput);
                continue;
            }
            int alphabetIndex = ALPHABET.indexOf(characterInput);
            int encryptedIndex = alphabetIndex - shift;
            if (encryptedIndex < 0) {
                encryptedIndex = 25;
            }
            char encryptedChar = ALPHABET.charAt(encryptedIndex);
            encrypted.append(encryptedChar);
        }
        return encrypted.toString();
    }
}

/*

karakter z = 25
validasi lulus

(25 + 10) % 26 = 4
35 % 26 =

alphabetIndex = 20
encryptedIndex = (20 + 10) % 26;

 */
