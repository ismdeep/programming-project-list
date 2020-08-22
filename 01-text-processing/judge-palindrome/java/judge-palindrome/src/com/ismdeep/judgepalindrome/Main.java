package com.ismdeep.judgepalindrome;

public class Main {

    public static boolean judgePalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "121";
        System.out.println(judgePalindrome(str));
    }
}
