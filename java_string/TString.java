package com.castles.winter;

public class TString {
    public static void main(String[] args) {
        String valueOf = String.valueOf("\t");
        String valueOf2 = String.valueOf("\t");
        System.out.println(valueOf + "value");
        System.out.println(valueOf2  + "value");
        String valueOf3 = String.valueOf(valueOf);
        System.out.println(valueOf3 + "value");
        System.out.println(valueOf3.length());
        System.out.println(String.valueOf(valueOf).length());
    }
}

