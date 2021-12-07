package com.tasks.string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type your IP address: ");
        String ip = in.nextLine();
        in.close();
        String regexp = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";

        Pattern p = Pattern.compile(regexp);
        Matcher m = p.matcher(ip);
        if (m.find()) {
            System.out.print(m.group() + " IP address input is correct.");
        } else {
            System.out.println("Incorrect IP address input!");
        }
    }
}

