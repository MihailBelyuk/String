package com.tasks.string;

public class String4 {
    public static void main(String[] args) {
        String string = new String("/*        String str = \"Da bu di da bu da\";\n" +
                "\n" +
                "        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};\n" +
                "*/\n" +
                "/**      char[] charArray = str.toCharArray();\n" +
                "       for (int i = 0; i < charArray.length; i++) {\n" +
                "*/       \n" +
                "//        char c = charArray[i];\n" +
                "//        for (int a = 0; a < vowels.length; a++) {\n" +
                "//            char b = vowels[a];\n" +
                "//            if (c == b) {\n" +
                "//                System.out.println(b);\n" +
                "//            }");


        string = string.replaceAll("//", "");
        string = string.replaceAll("/\\*\\*", "");
        string = string.replaceAll("/\\*", "");
        string = string.replaceAll("\\*/", "");

        System.out.println(string);

    }
}

