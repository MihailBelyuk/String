package com.tasks.string;

public class StringPractice {
    public static void main(String[] args) {
        //1
        StringBuilder sr = new StringBuilder("Da bu di da bu da");
        System.out.println(sr.reverse());
        System.out.println();

        //2
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


