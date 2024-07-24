package org.dingco;

import org.dingco.encryption.Chiper;

public class Main {

    public static void main(String[] args) {
        System.out.println(Chiper.encrypt("Attack The Dawn", 10));
        Chiper.checkLength();
        System.out.println("versi 1: ABCDEFGHIJKLMNOPQRSTUVWXYZ 123456789 [].;,");
        System.out.println("versi 2: " + Chiper.encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ 123456789 [].;,", 2));
        System.out.println("versi 1: CDEFGHIJKLMNOPQRSTUVWXYZAB 123456789 [].;,");
        System.out.println("versi 2: " + Chiper.decrypt("CDEFGHIJKLMNOPQRSTUVWXYZAB 123456789 [].;,", 2));
    }
}