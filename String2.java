package com.tasks.string;

public class String2 {
    public static void main(String[] args) {
        String str = "Da bu di da bu da";

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {

            char c = charArray[i];
            for (int a = 0; a < vowels.length; a++) {
                char b = vowels[a];
                if (c == b) {
                    System.out.println(b);
                }
            }
        }
    }
}
