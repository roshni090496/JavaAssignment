package com.company;

import java.util.Scanner;

public class CheckString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get the strings which is to be checked
        System.out.println ("Enter the first string");
        String string1 = in.nextLine();
        System.out.println("Enter the first string: "
                + string1);

        // Get the strings which is to be checked
        System.out.println ("Enter the second string");
        String string2 = in.nextLine();
        System.out.println("Enter the second string :"
                + string2);

        // Check if both strings are equal
        System.out.println("\nAre both strings same: ");

        if (string1.equals(string2) == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    }

