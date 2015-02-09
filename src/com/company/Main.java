package com.company;

public class Main {

    public static void main(String[] args) {
        String palindromeMaybe = new String("Ah, Satan sees Natasha");
        checkForPalindrome(palindromeMaybe);
    }

    static void checkForPalindrome(String text) {
        String strippedText = text.toLowerCase();
        strippedText = strippedText.replace(" ", "");
        strippedText = strippedText.replaceAll("\\p{Punct}", "");
        for (int i = 0; i < strippedText.length() / 2; i++) {
            if (strippedText.charAt(i) != strippedText.charAt(strippedText.length() - 1 - i)) {
                System.out.println("\"" + text + "\" is not a palindrome");
                return;
            }
        }
        System.out.println("\"" + text + "\" is a palindrome");

    }
}
