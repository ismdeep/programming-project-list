package com.ismdeep.reversestring;

public class Main {

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(str.length() - i - 1));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hello-world.";
        System.out.println(reverse(str));
    }
}
