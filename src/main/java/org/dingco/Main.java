package org.dingco;

import org.dingco.encryption.Chiper;

public class Main {

    public static void main(String[] args) {
        System.out.println(Chiper.encrypt("Attack The Dawn", 10));
        System.out.println("versi 1: ABCDEFGHIJKLMNOPQRSTUVWXYZ 123456789 [].;,");
        System.out.println("versi 2: " + Chiper.encrypt("ABCDEFGHIJKLMNOPQRSTUVWXYZ 123456789 [].;,", 2));
    }
}