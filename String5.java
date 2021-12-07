package com.tasks.string;

public class String5 {
    public static void main(String[] args) {

        String song = "Da bu di da bu da";
        String a[] = song.split(" ");
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareToIgnoreCase(a[i]) < 0) {
                    String temporary = a[i];
                    a[i] = a[j];
                    a[j] = temporary;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            String word = a[i];
            System.out.print(word + " ");
        }
    }
}


