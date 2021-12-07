package com.tasks.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type your email: ");
        String email = in.nextLine();
        in.close();
        String regexp = "(\\w*\\d*)@(\\w+\\.)([a-z]{2,4})";

        Pattern p = Pattern.compile(regexp);
        Matcher m = p.matcher(email);
        if (m.find()) {
            System.out.print(m.group() + " is correct email address input.");
        } else {
            System.out.println("Incorrect email address input!");




        }
    }
}


