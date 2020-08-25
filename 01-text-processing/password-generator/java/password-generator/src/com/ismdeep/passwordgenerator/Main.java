package com.ismdeep.passwordgenerator;

import java.util.Random;

public class Main {

    public static String genPassword(int len) {
        String base = "23456789abcdefghijkmnprstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(base.charAt(rand.nextInt(base.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int len = 8;
        if (args.length >= 1) {
            len = Integer.parseInt(args[0]);
        }

        System.out.println(genPassword(len));
    }
}
