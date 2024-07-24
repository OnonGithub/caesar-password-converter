package org.dingco;

import org.dingco.encryption.Chiper;

public class Main {

    public static void main(String[] args) {
        System.out.println(Chiper.encrypt("Attack The Dawn!", 100));
        System.out.println(Chiper.decrypt("WPPWYG PDA ZWSJ!", 100));
    }
}