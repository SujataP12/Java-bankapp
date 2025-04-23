package com.bankapp.util;

import java.util.Scanner;

public class InputHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static double readDouble(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static int readInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }
}
